
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ajava3 {
     public static void main(String[] args) {
        
            Connection con=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/16it053", "root", "");
            Statement st=con.createStatement();
            String str="select * from student ";
            ResultSet rs=st.executeQuery(str);
            //System.out.println(rs);
            while(rs.next())
            {
                rs.getRowId("id");
                System.out.println(" "+rs.getString("id"));
                System.out.println(rs.getString(2));
            }
          
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Ajava2.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Ajava2.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
               
            try {
                    con.commit();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Ajava2.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
}
}
