package jdbc;


import java.sql.Connection;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
	    System.out.println("Done");
//	    Statement st=con.createStatement();
//		String sql="create table emp(eno int,ename varchar(20))";
		
		
	}

}
