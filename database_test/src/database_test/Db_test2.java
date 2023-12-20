package database_test;
import java.sql.*;

public class Db_test2 {
	  public static void main(String[] args) throws ClassNotFoundException , SQLException {
		   String url="jdbc:mysql://127.0.0.1:3306/first"; //ip add + database name
		   String username = "root";
		   String password="abcROOT123";
		   
		   String sql="CREATE TABLE Employee"+
		   "(id INTEGER not NULL , "+
				   "first VARCHAR(255), "+
		   "last VARCHAR(255), "+
				   "age INTEGER , "+
		   "PRIMARY KEY (id))";
		   
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection(url,username,password);
		   Statement st=con.createStatement();
		   int res =st.executeUpdate(sql);
		   System.out.println(res+"Rows Affected");
		   System.out.println("Inserting records into the table ...");
		   sql="INSERT INTO Employee VALUES (100,'ZARA','Ali',18)";
		   st.executeUpdate(sql);
		   sql="INSERT INTO Employee VALUES (101 , 'Mahnaz' ,'Fatma',25) ";
		   st.executeUpdate(sql);
}}
