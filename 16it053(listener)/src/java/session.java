/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class session extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InterruptedException,java.lang.NullPointerException {
      try {
           ServletContext ctx=null;
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/session_login", "root","");
            Statement st=con.createStatement();
           
            String n=request.getParameter("username");
            String m=request.getParameter("password");
            String str="select * from login ";
            ResultSet rs=st.executeQuery(str);
            while(rs.next())
            {
                if((rs.getString(1) == null ? n == null : rs.getString(1).equals(n)) && (rs.getString(2) == null ? m == null : rs.getString(2).equals(m)))
                {
                         out.println("Welcome "+n);
               
                         HttpSession session=request.getSession();
                         out.println("Session ID"+session.getId());
                         session.setAttribute("uname",n);
                         session.setAttribute("pswd", m);
                          ctx=getServletContext();  
                          
                          int t=(Integer)ctx.getAttribute("total");  
        
                        out.print("<br>total users= "+t);  
      
                         out.print("<br><a href='logout'>logout</a>");  
            }}
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(session.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InterruptedException ex) {
            Logger.getLogger(session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
          
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
