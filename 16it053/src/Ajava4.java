
import java.sql.*;
import java.lang.*;
import java.util.*;
public class Ajava4 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_detail","root","");
        Statement st=con.createStatement();
        String str="create table Book ( id integer ,name varchar(20) , authors varchar(30), publication varchar(20) , price integer);";
        //st.executeUpdate(str);
        String str2="insert into Book values(1,'one indian girl','chetan bhagat','penguine',150)";
        //st.executeUpdate(str2);
        String str3="insert into Book values(2,'Me before you','jojo moyes','london',350)";
        //st.executeUpdate(str3);
        String str4="insert into Book values(3,'origin','Dan Brown','abc',500)";
        //st.executeUpdate(str4);
        String str5="update Book set price=300 where id=2";
        //st.executeUpdate(str5);
        String str6="delete from Book where id=1";
        //st.executeUpdate(str6);
        String str7="select * from Book";
       // ResultSet rs= st.executeQuery(str7);
      //  while(rs.next())
       // {
           // System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
            
       // }
        String str8="alter table Book add time DATETIME";
        //st.executeUpdate(str8);
        String str9="insert into Book values(1,'One indian girl','chetan bhagat','penguine',150, NOW())";
        st.executeUpdate(str9);
       
    }
}
