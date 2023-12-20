package database_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
String url="jdbc:mysql://127.0.0.1:3306/first"; //ip add + database name
String username = "root";
String password="abcROOT123";
int id;
String sql="CREATE TABLE IF NOT EXISTS Student_reg"+
"(id INTEGER PRIMARY KEY , "+
		   "fName VARCHAR(255), "+
"lName VARCHAR(255), "+
		   "Major  VARCHAR(255) , "+
		 "  age INTEGER,"+"city VARCHAR(255), "+"country VARCHAR (255))";

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
int res =st.executeUpdate(sql);

System.out.println(res+"Rows Affected");
System.out.println("Inserting records into the table ...");
System.out.println("Please enter the ID : ");
id=sc.nextInt();


	}}


