/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import jdbc.DaoImpl.StudentDaoImpl;
import jdbc.model.StudentBean;

/**
 *
 * @author test
 */
public class DesignPattern {
    public static void main(String[] args) throws Exception
    {
    boolean status =false;
        StudentBean sb=new StudentBean();
        sb.setStudentId(100);
        sb.setStudentName("Karthiga");
        
        StudentDaoImpl sdao=new StudentDaoImpl();
        status=sdao.insertData(sb);
        
    
    
    
    }
}