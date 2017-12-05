import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * Created by jeffeben on 12/2/17.
 */
public class JDBC_Driver {

    private static int PRIMARY_KEY_INDEX = 4;

    // This method will take the type of attribute and find the name and type of each attribute
    // NOTE: This method only works if all attributes in individual relation are NOT NULL
    // RETURN TYPE: This will return a list of JPanelAttributes if no error.  Or null if error.
    public static List<JPanelAttribute> attributeList(String fromRelation) {
        List<JPanelAttribute> attributes = new LinkedList<>();
        Connection conn;
        Statement stat;
        try {
            Class.forName("org.postgresql.Driver").newInstance();

            String url = "jdbc:postgresql://localhost/databaseproject"; // Name/port on localhost may need to change
            Properties props = new Properties();
            props.setProperty("user", "jeffeben"); // May need to change username
            props.setProperty("password", "");
            props.setProperty("useSSL", "false");
            conn = DriverManager.getConnection(url, props);

            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM " + fromRelation);
            rs.next();

            // Indexing starts at 1 for SQL I believe
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                String name = rs.getMetaData().getColumnName(i);
                int type = rs.getMetaData().getColumnType(i);
                System.out.println(type);
                if (type == Types.VARCHAR) {
                    //enums
                    switch(name.toLowerCase()){
                        case "handlebarmaterialtype":
                            attributes.add(new JPanelEnumHandlebar(name));
                            break;
                        case "frametype":
                            attributes.add(new JPanelEnumFrameGeometry(name));
                            break;
                        case "framematerialtype":
                            attributes.add(new JPanelEnumFrameMaterial(name));
                            break;
                        case "family":
                            attributes.add(new JPanelEnumShifter(name));
                            break;
                        case "braketype":
                            attributes.add(new JPanelEnumBrake(name));
                            break;
                        case "derailleurfamily":
                            attributes.add(new JPanelEnumDerailleur(name));
                            break;
                        default:
                            attributes.add(new JPanelVarchar(name));
                    }
                }
                else if (type == Types.INTEGER) {
                    attributes.add(new JPanelInt(name));
                }
                else if (type == Types.DOUBLE) {
                    attributes.add(new JPanelDouble(name));
                }
                else {
                    throw new Exception("Wrong data type returned.  Not Varchar , Integer, Double, or Enum");
                }
            }

            return attributes;

        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // This will return the query of bikes.  It will always be 14 attributes per line
    // RETURN TYPE: this will return a Linked List of String arrays if no error.  Else null if error.
    //  - Each String array = tuple.  Each element of String array = individual data entry.
    //INPUT TYPE: Should input the attribute query "Ex: SELECT RearShockID FROM RearShock WHERE RearShockID = 123"
    //public List<String[]> bikeList(String subQuery) {
    public List<String[]> bikeList(List<QueryObject> queries) {

        List<String[]> bikeParts = new LinkedList<>();
        String[] firstRow = new String[]{"modelName", "manufacturerName", "derailleurID", "rearShockID", "frontShockID", "brakeID", "shifterID",
        "frameID", "wheelID", "cranksetID", "handlebarID", "price", "year", "picture"};
        bikeParts.add(firstRow);
        Connection conn;
        Statement stat;
        try {
            Class.forName("org.postgresql.Driver").newInstance();

            String url = "jdbc:postgresql://localhost/databaseproject"; // Name/port on localhost may need to change
            Properties props = new Properties();
            props.setProperty("user", "jeffeben"); // May need to change username
            props.setProperty("password", "");
            props.setProperty("useSSL", "false");
            conn = DriverManager.getConnection(url, props);

            // Find primary key
            ResultSet keys;
            stat = conn.createStatement();
            DatabaseMetaData dbmd = conn.getMetaData();
            for (QueryObject subQuery : queries) {
                if (!(subQuery instanceof NerfedQueryObject)) {
                    keys = dbmd.getPrimaryKeys(conn.getCatalog(), "public", subQuery.getName().toLowerCase());
                    keys.next();
                    subQuery.setPrimaryKey(keys.getString(PRIMARY_KEY_INDEX));
                }
            }

            stat = conn.createStatement();
            StringBuilder query = new StringBuilder();
            // Can add in NOT easily later by splitting up string and using a flag
            query.append("SELECT b.* FROM Bike b WHERE ");
            boolean start = true;
            for (QueryObject nestedSubQuery : queries) {
                if (!start) {
                    query.append(" AND ");
                }
                if (nestedSubQuery instanceof NerfedQueryObject) {
                    query.append(nestedSubQuery.getQuery());
                }
                else {
                    query.append("NOT EXISTS ((SELECT x.");
                    query.append(nestedSubQuery.getPrimaryKey());
                    query.append(" FROM ");
                    query.append(nestedSubQuery.getName().toLowerCase());
                    query.append(" x WHERE x.");
                    query.append(nestedSubQuery.getPrimaryKey());
                    query.append(" = b.");
                    query.append(nestedSubQuery.getPrimaryKey());
                    query.append(") EXCEPT ");
                    query.append(nestedSubQuery.getQuery());
                    query.append(")");
                }
                start = false;
            }
            System.out.println(query.toString());
            ResultSet rs = stat.executeQuery(query.toString());
            while (rs.next()) {
                String[] bike = new String[14];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    bike[i-1] = rs.getString(i);
                }
                bikeParts.add(bike);

            }
            return bikeParts;

        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }



}
