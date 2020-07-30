import java.sql.*;
public class Driver {
    public static void main(String[] args) throws SQLException{

        Connection myConn = null;
        Statement myStatement = null;
        ResultSet myRs = null;

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store", "root" , "root");

            // 2. Create a statement
            myStatement = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStatement.executeQuery("select * from customers");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("first_name") + ", " + myRs.getString("last_name")+ ", " + myRs.getString("points"));
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStatement != null) {
                myStatement.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }

}
