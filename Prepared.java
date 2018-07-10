import java.util.*;
import java.sql.*;
public  class  Prepared
{
  public static void main(String args[]) throws Exception
 {
   Class.forName("com.mysql.jdbc.Driver");
   System.out.println("Driver Loaded");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
   System.out.println("Connection Established");
   PreparedStatement pstmt=con.prepareStatement("insert into person values(?,?,?)");


   Scanner sc=new Scanner(System.in);
   while(true)
  {
   System.out.println("Enter your name -");
   String name=sc.nextLine();  
   pstmt.setString(1,name);
   System.out.println("Enter your roll no. -");
   int roll_no=sc.nextInt();
   pstmt.setInt(2,roll_no);
   System.out.println("Enter your age -");
   int age=sc.nextInt();
   pstmt.setInt(3,age);  


   int i= pstmt.executeUpdate();


   System.out.println("To Enter more info press 1 else 2");
   int UserInput=sc.nextInt();
   if(UserInput==1){}
   else
   {
    System.exit(0);
   }
 }



 }
}