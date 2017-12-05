import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * Created by jeffeben on 12/2/17.
 */
public class JDBC_Driver {

    private List<String> subQueries = new LinkedList<>();

    private final static int ENUM = 1;

    // This method will take the type of attribute and find the name and type of each attribute
    // NOTE: This method only works if all attributes in individual relation are NOT NULL
    // RETURN TYPE: This will return a list of JPanelAttributes if no error.  Or null if error.
    public static List<JPanelAttribute> attributeList(String fromRelation) {
        List<JPanelAttribute> attributes = new LinkedList<>();
        Connection conn;
        Statement stat;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://localhost/DatabaseProject"; // Name/port on localhost may need to change
            Properties props = new Properties();
            props.setProperty("user", "root"); // May need to change username
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
                if (type == Types.VARCHAR) {
                    attributes.add(new JPanelVarchar(name));
                }
                else if (type == Types.INTEGER) {
                    attributes.add(new JPanelInt(name));
                }
                else if (type == Types.DOUBLE) {
                    attributes.add(new JPanelDouble(name));
                }
                // ENUM interpreted as type 1 (CHAR)
                else if (type == ENUM) {
                    System.out.println("Not implemented yet (Enums)");
                    switch(name){
                        case "handlebarMaterialType":
                            attributes.add(new JPanelEnumHandlebar(name));
                            break;
                        case "frameType":
                            attributes.add(new JPanelEnumFrameGeometry(name));
                            break;
                        case "frameMaterialType":
                            attributes.add(new JPanelEnumFrameMaterial(name));
                            break;
                        case "family":
                            attributes.add(new JPanelEnumShifter(name));
                            break;
                        case "brakeType":
                            attributes.add(new JPanelEnumBrake(name));
                            break;
                        case "derailleurFamily":
                            attributes.add(new JPanelEnumDerailleur(name));
                            break;
                        case "default":
                            attributes.add(new JPanelVarchar(name));
                    }
                    //attributes.add(new JPanelEnum(rs.getMetaData().getColumnName(i)));
                }
                else {
                    throw new Exception("Wrong data type returned.  Not Varchar , Integer, or Double");
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
    public List<String[]> bikeList(String subQuery) {
        subQueries.add(subQuery);

        List<String[]> bikeParts = new LinkedList<>();
        Connection conn;
        Statement stat;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://localhost/DatabaseProject"; // Name/port on localhost may need to change
            Properties props = new Properties();
            props.setProperty("user", "root"); // May need to change username
            props.setProperty("password", "");
            props.setProperty("useSSL", "false");
            conn = DriverManager.getConnection(url, props);

            stat = conn.createStatement();
            StringBuilder query = new StringBuilder();
            // Can add in NOT easily later by splitting up string and using a flag
            query.append("SELECT * FROM BIKE WHERE EXISTS ((");
            boolean start = true;
            for (String nestedSubQuery : subQueries) {
                if (!start) {
                    query.append(" AND (");
                }
                query.append(subQuery);
                query.append(")");
                start = false;
            }
            query.append(")");
            ResultSet rs = stat.executeQuery(query.toString());

            while (rs.next()) {
                String[] bike = new String[14];
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    bike[i=1] = rs.getString(1);
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
