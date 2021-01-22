
package com.klu.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.klu.connections.DBUtil;
import com.klu.Bean.StudentBean;
public class StudentInsertion {
	Scanner s = new Scanner(System.in);
   public int StudentInsert(StudentBean student)throws ClassNotFoundException, SQLException
   {
	   Connection con=DBUtil.DBConnection();
	   PreparedStatement ps=con.prepareStatement("insert into Studentdetails values(?,?,?)"); 
	   ps.setInt(1,student.getRegno());
	   ps.setString(2,student.getName());
	   ps.setString(3,student.getEmail());
	   int i = ps.executeUpdate();
	   return i;
   }
   public int StudentDelete(StudentBean student)throws ClassNotFoundException, SQLException
   {
	   Connection con=DBUtil.DBConnection() ;
	   int id=s.nextInt();
	   PreparedStatement stmt=con.prepareStatement("delete from StudentDetails where id=?");  
	   stmt.setInt(1,id);  
	   int i=stmt.executeUpdate();  
	   return i;
   }
   public int StudentUpdate(StudentBean student)throws ClassNotFoundException, SQLException
   {
	   Connection con=DBUtil.DBConnection();
	   
	   int id=s.nextInt();
	   
	   String name=s.next();
	   PreparedStatement stmt=con.prepareStatement("update StudentDetails set name=? where id=?");  
	   stmt.setString(1,name);//1 specifies the first parameter in the query i.e. name  
	   stmt.setInt(2,id);  
	     
	   int i=stmt.executeUpdate();  
	   return i;
   }
   public void StudentDisplay(StudentBean student)throws ClassNotFoundException, SQLException
   {
	   Connection con=DBUtil.DBConnection();
	   PreparedStatement stmt=con.prepareStatement("select * from StudentDetails");  
	   ResultSet rs=stmt.executeQuery();  
	   while(rs.next()){  
	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	   
	   }  
	   
   }
   
   
   
}