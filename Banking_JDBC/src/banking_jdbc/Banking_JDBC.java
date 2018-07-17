/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author test
 */
public class Banking_JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.47:1521:xe","User3","password");
        Statement st=con.createStatement();
        String query="";
        float balance=0;
        int f=0;
        
        
        
       
     while (true){
     {  Scanner scan=new Scanner(System.in);
     String username,password;
         System.out.println("Enter username:");
         username=scan.next();
         System.out.println("Enter password:");
         password=scan.next();
         //String query2="select count(*)from Credentials";
        // ResultSet rs2=st.executeQuery(query2);
         query="select * from Credentials";
         ResultSet rs=st.executeQuery(query);
         
         while (rs.next())
         {//System.out.println(rs.getString(1)+rs.getString(2));
         if (username.equals(rs.getString(1))&& password.equals(rs.getString(2)))
         {f=1;
         System.out.println("Access allowed");
         int n=0;
         while (n!=5)
         {
         
         System.out.println(" \n Menu \n 1. Account Creation \n 2. Deposit \n 3. Withdrawal \n 4. Balance Check \n 5. Exit");
         n=scan.nextInt();
         int flag=0;
         switch(n)
         {
             case 1: System.out.println("Welcome \n Enter customer's name:");
                    String name=scan.next();
                    //System.out.println("Enter your DOB in yyyy-mm-dd format:");
                    System.out.println("Enter customer's age:");
                    int age=scan.nextInt();
                    System.out.println("Enter newly generated account number:");
                    int account=scan.nextInt();
                    balance=500;
                    query="insert into account values ("+account+","+balance+")";
                    
                    rs=st.executeQuery(query);
                    
                    System.out.println("Newly generated account details are: \n Name:"+name);
                    System.out.println("Age:"+age);
                    System.out.println("Balance:"+balance);
                    System.out.println();
                    break;
                    
             case 2: 
                    System.out.println("Enter the account number:");
                    account=scan.nextInt();
                    //query="select * from account";
                    rs=st.executeQuery(query);
                    //System.out.println(query);
                    while (rs.next())
                    {// System.out.println("Test message");
                        if (account==rs.getInt(1))
                        
                    {   
                        System.out.println("Enter the amount to be deposited:");
                        int deposit=scan.nextInt();
                        String query2="select balance from account where account_number="+account;
                        //System.out.println(query2);
                        rs=st.executeQuery(query2);
                        while (rs.next())
                          
                        {balance=rs.getFloat(1);
                        System.out.println(balance);}
                        query="update account set balance="+(balance+deposit)+"where account_number="+account;
                        rs=st.executeQuery(query);
                        flag=1;
                        System.out.println("Amount deposited!");
                        break;
                    }
                    
                    }
                    if (flag==0)
                    {System.out.println("Please create account number!");}
                    break;
                    
                    
             case 3:
                 System.out.println("Enter the account number:");
                    account=scan.nextInt();
                    query="select * from account";
                    rs=st.executeQuery(query);
                    //System.out.println(query);
                    while (rs.next())
                    {// System.out.println("Test message");
                        if (account==rs.getInt(1))
                        
                    {   
                        System.out.println("Enter the amount to be withdrawn:");
                        int withdrawal=scan.nextInt();
                        String query2="select balance from account where account_number="+account;
                        //System.out.println(query2);
                        rs=st.executeQuery(query2);
                        while (rs.next())
                          
                        {balance=rs.getFloat(1);
                        //System.out.println(balance);
                        }
                        
                        if (balance<withdrawal)
                        {System.out.println("Insufficient balance!");
                        break;}
                        query="update account set balance="+(balance-withdrawal)+"where account_number="+account;
                        rs=st.executeQuery(query);
                        flag=1;
                        System.out.println("Amount withdrawn!");
                        break;
                    }
                    
                    }
                    if (flag==1)
                    { System.out.println("Create account");}
                    break;
                    
                    
                 
             case 4:
                 System.out.println("Enter the account number:");
                 account=scan.nextInt();
                 query="select * from account";
                 rs=st.executeQuery(query);
                 while (rs.next())
                 {
                 
                if (account==rs.getInt(1))
                {
                System.out.println("Balance is:"+rs.getFloat(2));
                break;
                }
                System.out.println("Create account!");
                 break;
                 
                 }
                 
         
               
                    
                    
                    
                    
                    
                            
                    
                    
                  
                    
         
         
         
         }
                 
         
         
         }
         
         
         
         }
          
         
         }if (f==0)
         {System.out.println("Credentials do not match. Access denied!");}
         
         }
        
         
         
                 
     
     
     }
        
    
    }
    
}
