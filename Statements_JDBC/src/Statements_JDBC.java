
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class Statements_JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
    
    Connection con=null;
    PreparedStatement st=null;
    ResultSet rs=null;
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
   con=DriverManager.getConnection(url,"User3","password");
    String query="insert into Emp values (?,?)";
    st=con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
    st.setInt(1, 8);
    st.setString(2,"Divya");
    //int count=st.executeUpdate();
    st.executeUpdate();
    /*if (count>0)
    {
    System.out.println("Action successful");
    }*/
    
    
    rs=st.getGeneratedKeys();
    if (rs!=null && rs.next())
            System.out.println("Auto-generated key:"+rs.getInt(1));
    }
    
    
     
    finally
    {
        if (st!=null) st.close();
        if (con!=null) con.close();
            
            
   }
    
    
    }
}
