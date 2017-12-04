import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * Created by jeffeben on 12/2/17.
 */
public class JDBC_Driver {

    public static void main(String[] args) {


    }

    // This method will take the type of attribute and find the name and type of each attribute
    // NOTE: This method only works if all attributes in individual relation are NOT NULL
    public static List<JPanelAttribute> attributeList(String fromRelation) {
        List<JPanelAttribute> attributes = new LinkedList<>();
        Connection conn;
        Statement stat;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://localhost/DatabaseProject"; // Name/port on localhost may need to change
            Properties props = new Properties();
            props.setProperty("user", "mysql"); // May need to change username
            props.setProperty("password", "123456");
            conn = DriverManager.getConnection(url, props);

            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM " + fromRelation);
            rs.next();

            // Indexing starts at 1 for SQL I believe
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                if (rs.getMetaData().getColumnType(i) == Types.VARCHAR) {
                    attributes.add(new JPanelVarchar(rs.getMetaData().getColumnName(i)));
                }
                else if (rs.getMetaData().getColumnType(i) == Types.INTEGER) {
                    attributes.add(new JPanelInt(rs.getMetaData().getColumnName(i)));
                }
                else if (rs.getMetaData().getColumnType(i) == Types.DOUBLE) {
                    attributes.add(new JPanelDouble(rs.getMetaData().getColumnName(i)));
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

    private static void executeQuery(String query) {

        List<QueryObject> bikeParts = new LinkedList<>();
        Connection conn;
        Statement stat;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://localhost/DatabaseProject"; // Name/port on localhost may need to change
            Properties props = new Properties();
            props.setProperty("user", "mysql"); // May need to change username
            props.setProperty("password", "123456");
            conn = DriverManager.getConnection(url, props);

            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(query);

            // This should return the
            //rs.getMetaData().getColumnType(index)
            //rs.getMetaData().getColumnName(index)
            while (rs.next()) {
                //rs.columnType (to find which type it is)
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //model
                    //man.
                    //...

                    //QueryObject queryObject = sun.reflect.Reflection.

                    //Field field =


                    //outputString.append(rs.getString(i));
                    // May want to change logic of this to format data better
                    //if (i < rs.getMetaData().getColumnCount()) {
                      //  outputString.append(", ");
                    //}
                }

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }



}
