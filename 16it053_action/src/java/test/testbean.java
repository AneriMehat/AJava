package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class testbean implements Serializable {
    
   String name;
   String id;
   int age;
    
    public testbean() {
       
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name=name;
    }
     
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id=id;
    } 
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age=age;
    }
    
   // public void addPropertyChangeListener(PropertyChangeListener listener) {
     //   propertySupport.addPropertyChangeListener(listener);
    //}
    
    //public void removePropertyChangeListener(PropertyChangeListener listener) {
      //  propertySupport.removePropertyChangeListener(listener);
    //}
    
}
