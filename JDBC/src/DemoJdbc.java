import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class DemoJdbc {

    /*
        1) Import Package
        2) Load and register driver
        3) Create Connection
        4) Create Statement
        5) Execute Statement
        6) Process the results
        7) Close
    */
    public static void main(String[] args) throws Exception{


        int sid =102;
        String sname ="KP";
        int marks =100;
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Karan@2000";
//        String sql ="insert into student values (7,'Johan',78)";          // *--insert--*
        String sql ="insert into student values (?,?,?)";



            // Load and register the driver (optional since JDBC 4.0)
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(url, uname, pass);

            System.out.println("Connection Established");

//
        PreparedStatement st =con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);

        //        *---Statement---*:
        //        SQL Injection: More prone to SQL injection attacks because it concatenates user inputs directly into the SQL query.
        //        Performance:   Every time a Statement is executed, the SQL query is compiled and executed by the database.
        //                       Less efficient for repeated execution of the same query with different parameters.
        //        Use Case:      Suitable for executing SQL queries that are used only once or do not require parameters.

        //        *---PreparedStatement---*:
//        PreparedStatement is used for executing parameterized SQL queries.
//        SQL Injection:
//                      Provides better security against SQL injection attacks by separating the SQL logic from the data.
//                      User inputs are treated as data and not part of the SQL command.
//                      PreparedStatement can be precompiled and reused, which improves performance for repeated execution of the same query with different parameters


                st.execute();

//            Statement st =con.createStatement();           *--Statement--*
//            ResultSet rs = st.executeQuery(sql);
//            rs.next();
//            String name =rs.getString("sname");
//            System.out.println("Name of Student is :"+ name);
//              while (rs.next()){
//                  System.out.print(rs.getInt(1)+" - ");
//                  System.out.print(rs.getString(2)+" - ");
//                  System.out.println(rs.getInt(3));
//              }




            // Don't forget to close the connection
            con.close();
        System.out.println("Connection Closed");


    }
}
