/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.DaoImpl;

import java.sql.Connection;
import java.sql.Statement;
import jdbc.Dao.StudentDao;
import jdbc.Database.DatabaseConnectivity;
import jdbc.model.StudentBean;

/**
 *
 * @author test
 */
public class StudentDaoImpl implements StudentDao{

    @Override
    public boolean insertData(StudentBean s) throws Exception {
        int i=0;
        boolean status= false;
        Connection con=DatabaseConnectivity.connect();
        Statement statement=con.createStatement();
        //String query1="insert into Emp values("+s.getStudentId()+",'"+s.getStudentName()+"')";
        //String query1="delete from Emp where name='"+s.getStudentName()+"'";
        String query1="update Emp set id="+1+"where name='"+s.getStudentName()+"'";
        i=statement.executeUpdate(query1);
        if (i>0)
        {status = true;}
        return status;
        
              
        
    }
    
}
