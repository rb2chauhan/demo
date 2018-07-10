import java.sql.*;

class MysqlCo
{
  public static void main(String args[]) 
  {
   try
   {
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver loaded");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
    System.out.println("connection loaded");
   
  Statement stmt=con.createStatement();  
  //String query="insert into prod values('rishabh',15033,'2015/05/12')";
  ResultSet rs=stmt.executeQuery("select * from record") ;  
  ResultSetMetaData rmd=rs.getMetaData();
  int n =rmd.getColumnCount();
  int i;
  for(i=1;i<=n;i++)
  {
   String t= rmd.getColumnTypeName(i);
   //System.out.println(rs.get(i));
  }
  con.close();  
  }
   catch(Exception e)
   {
    System.out.println("Driver not loaded");
    System.out.println("connection not loaded");
   }
   
  }
}