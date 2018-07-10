import java.sql.*;

public class MySql
{
 public static void main(String args[])
 {
  try
  {
   Class.forName("com.mysql.jdbc.Driver"); 
   System.out.println("Driver Loaded");
  }
  catch(ClassNotFoundException e)
  {
   System.out.println("Driver Not Loaded"); 
  }  

 }
}