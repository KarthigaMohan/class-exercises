
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class PreparedStatement_RS {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    Connection con=null;
    PreparedStatement st=null;
    ResultSet rs=null;
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
   con=DriverManager.getConnection(url,"User3","password");
    String query="select * from Emp where id=?";
    st=con.prepareStatement(query);
    st.setInt(1, 8);
    //st.setString(2,"Nischala");
    
   rs=st.executeQuery();
   while (rs.next())
   {
    System.out.println("Id:"+rs.getInt("id")+" Name:"+rs.getString(2));
       
       
   }
    rs.close();
    
     st.setInt(1, 2);
    //st.setString(2,"Nischala");
    
   rs=st.executeQuery();
   while (rs.next())
   {
    System.out.println("Id:"+rs.getInt("id")+" Name:"+rs.getString(2));
       
       
   }
    rs.close();
    
    
    
 
    }
     finally
    {   if (rs!=null) rs.close();
        if (st!=null) st.close();
        if (con!=null) con.close();
            
            
   }
    
   
    }
    
    
     
  
}
