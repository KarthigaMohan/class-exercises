/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import jdbc.DaoImpl.StudentDaoImpl;
import java.util.*;
import jdbc.model.StudentBean;


/**
 *
 * @author test
 */
public class DesignPattern_Select {
    public static void main(String[] args) throws Exception
    {
    
    StudentDaoImpl sdao=new StudentDaoImpl();
		List<StudentBean> l=sdao.fetchDetails();
		StudentBean sb=new StudentBean();
		Iterator<StudentBean> itr=l.iterator();
		while(itr.hasNext())
		{
			   sb=(StudentBean)itr.next();
			   System.out.println(sb.getStudentId()+"    "+sb.getStudentName());
		}
    
    
    
    }
    
}
