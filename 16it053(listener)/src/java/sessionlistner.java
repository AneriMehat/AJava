
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.ServletContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author Admin
 */
public class sessionlistner implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {
   public ServletContext ctx=null;  
   
    public static int totalActiveSessions=0;

    
	
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        try{
              
        totalActiveSessions++;
     
        ctx.setAttribute("total", totalActiveSessions);  
	System.out.println("sessionCreated - add one session into counter");}
       catch(java.lang.IllegalStateException e){}
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        
        try{
        totalActiveSessions--;
         ctx.setAttribute("total", totalActiveSessions);  
	System.out.println("sessionDestroyed - deduct one session from counter");}//To change body of generated methods, choose Tools | Templates.
       catch(java.lang.IllegalStateException e){}
        
    
    }
    

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
         //To change body of generated methods, choose Tools | Templates.
    }
}
