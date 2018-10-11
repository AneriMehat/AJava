
import java.sql.*;


public class Ajava1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/16it053", "root", "");
        Statement st=con.createStatement();
        String str1="insert into student values(2,'aneri')";
        String str="update student SET name='DEF' WHERE name='ABC' ";
        st.executeUpdate(str);
        st.executeUpdate(str1);
        con.close();
        
    }
}
