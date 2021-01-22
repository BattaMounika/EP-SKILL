package com.klu.insert;

import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.StudentBean;
import com.klu.insert.StudentInsertion;
import java.util.Scanner;
public class Studentmain {
public static void main(String[] args)throws ClassNotFoundException,SQLException {
	Scanner s =new Scanner(System.in);
	
	StudentInsertion si=new StudentInsertion();
	StudentBean sb=new StudentBean();
	while(true) {
		System.out.println("\n1.insert into table \n2.delete from the table \n3.update the details in table \n4.display the details");
		int ch = s.nextInt();
	switch(ch) {
	case 1:
		System.out.println("enter id,name,email");
		int Regno=s.nextInt();
		String Name=s.next();
		String Email=s.next();
		
		sb.setRegno(Regno);
		sb.setName(Name);
		sb.setEmail(Email);
		int i=si.StudentInsert(sb);
		if(i>0)
			System.out.println("Insertion is successfull");
		else
			System.out.println("fail");
		break;
	case 2:
		int j=si.StudentDelete(sb);
		if(j>0)
			System.out.println("deletion is successfull");
		else
			System.out.println("fail");
		
		break;
	case 3:
		int u = si.StudentUpdate(sb);
		if(u>0)
			System.out.println("updation is successful");
		else
			System.out.println("fail");
		break;
		
	case 4:
		si.StudentDisplay(sb);
		break;
	}
	}
	
}
}