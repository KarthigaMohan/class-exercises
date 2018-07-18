/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.DaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import jdbc.Dao.StudentDao;
import jdbc.Database.DatabaseConnectivity;
import jdbc.model.StudentBean;

/**
 *
 * @author test
 */
public class StudentDaoImpl implements StudentDao{

    @Override
    public List<StudentBean> fetchDetails() throws Exception {
        List <StudentBean> list=new LinkedList<>();
        ResultSet rs=null;
        Connection con=DatabaseConnectivity.connect();
        Statement st=con.createStatement();
        String query="select * from Emp";
        rs=st.executeQuery(query);
        while (rs.next())
        {
            StudentBean bn=new StudentBean();
            bn.setStudentId(rs.getInt(1));
            bn.setStudentName(rs.getString(2));
            list.add(bn);
      
        
        
        }
        
        return list;        
    }

    

    

    
    
}
