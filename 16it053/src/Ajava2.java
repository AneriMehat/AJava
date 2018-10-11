
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ajava2 {

    public static void main(String[] args) {
        
            Connection con=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/16it053", "root", "");
            Statement st=con.createStatement();
            String str="delete from student where id=2 ";
            st.executeUpdate(str);
          
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Ajava2.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Ajava2.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Ajava2.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        
    }

    
}
