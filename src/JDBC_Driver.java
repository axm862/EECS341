import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * Created by jeffeben on 12/2/17.
 */
public class JDBC_Driver {

    public static void main(String[] args) {


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
