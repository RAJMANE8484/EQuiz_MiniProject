package com.databaseconnection;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.model.Quiz;
import com.model.Student;

public class Studentdboperation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Mini Project." );

		while (true) {
			System.out.println("PRESS 1 to ADD student");

			System.out.println("PRESS 2 to DISPLAY student data");
			System.out.println("PRESS 3 to DISPLAY student data by id");
			System.out.println("PRESS 4 to Exit");
			
			

			int c = sc.nextInt();

			if (c == 1) {
				// Add student1
				System.out.println("Enter student id: ");
				int id=	sc.nextInt();

				System.out.println("Enter Student Name: ");
				String name =sc.next();
				
				int Score = question();
				System.out.println("score is.."+Score);
				boolean ans = false;
				if(Score>10)
					System.out.println("Enter score between 1-10");
				else
				{
					Student st = new Student(id, name, Score);
					
					 ans = insertStudentRecordToDB(st);
				}
					
				if (ans) {
					System.out.println("Student record Inserted Successfully...");
				} else {
					System.out.println("Some error Occured While Inserting...Please try Again!");
				}

			} else if (c == 2) {
				// Display student
				showAllStudentRecords();
			} 
			else if (c == 3) { // Display student
				System.out.println("Enter student id: ");
				int id= sc.nextInt();
				showAllStudentRecordsbyId(id); }
			
			else if (c == 4) {
				// Exit

				System.out.println(
						"Thank You..!");
				break;
			}
			else {

			}
		}
	}
	
	private static boolean insertStudentRecordToDB(Student st) {
		boolean f = false;
		try {

			Connection con = Dbclass.createc(); 

			String query = "insert into student(Id,Name,Score) values(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query); 
			pstmt.setInt(1, st.getSid());
			pstmt.setString(2,st.getName()); 
			pstmt.setInt(3, st.getScore());

			pstmt.executeUpdate();
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	private static void showAllStudentRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = Dbclass.createc();
			String query = "select * from student ORDER BY Id";

			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);

			
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				int score = set.getInt(3);
				
				if(score>=8 && score<=10 )
					System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent score: "+"Class A : "+score );
				else if(score>=6 && score<=8)
					System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent score: "+"Class B : "+score );
				else if(score ==5)
					System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent score: "+"Class C : "+score );
				else 
					System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent score: "+"Class D : "+score+" Fail" );

				System.out.println("----------------------------------------------");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void showAllStudentRecordsbyId(int sid) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = Dbclass.createc();
			String query = "select Score from student where  Id="+sid ;

			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);

			while (set.next()) {

				int score = set.getInt("Score");

				System.out.println("Student score: " + score);
				System.out.println("----------------------------------------------");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public static int question() {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		try {
			Connection con = Dbclass.createc();
			String query = "select Questions , Options from quiz ";

			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);

			ArrayList<Quiz> quiz= new ArrayList<Quiz>();
			quiz.add(null);
			while (set.next()) {
				
				
				quiz.add(new Quiz(set.getString("Questions"), set.getString("Options")));
				
			}
			
			for(int i=1;i<=quiz.size();i++)
			{
				String querydata = "select Correct_Answer from quiz where Que_id = "+i;
				Statement st1 = con.createStatement();
				ResultSet set1 = st1.executeQuery(querydata);
				int correct_ans = 0 ;
				while (set1.next()) {
				 correct_ans = set1.getInt("Correct_Answer");
				 
				}
				System.out.println(quiz.get(i)+"\n");
				System.out.println("Enter Correct option: ");
				int op= sc.nextInt();
				
				if(op==correct_ans) {
					count++;
					System.out.println(count);
				}
				
			}
			System.out.println(count);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}
	
}
