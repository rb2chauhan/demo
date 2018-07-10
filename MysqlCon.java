import java.sql.*;

class MysqlCon
{
  public static void main(String args[]) 
  {
   try
   {
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver loaded");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
    System.out.println("connection loaded");
   
  /*Statement stmt=con.createStatement();  
  ResultSet rs=stmt.executeQuery("select * from record");  
  while(rs.next())  
  System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)); */ 
  
  con.close();  
  }
   catch(Exception e)
   {
    System.out.println("Driver not loaded");
    System.out.println("connection not loaded");
   }
   
  }
}