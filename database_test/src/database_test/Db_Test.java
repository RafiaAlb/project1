package database_test;
import java.sql.*;

public class Db_Test {
	   public static void main(String[] args) {
		   String url="jdbc:mysql://127.0.0.1:3306/first"; //ip add + database name
		   String username = "root";
		   String password="abcROOT123";
		 //import libraries
		   //load the drivers
		   
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			   //create a connection and open it

			Connection con=DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
	ResultSet rs= st.executeQuery("select * from student");
	
while(rs.next()) {
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
}
con.close();



		} catch (ClassNotFoundException  |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
		   
		   
		