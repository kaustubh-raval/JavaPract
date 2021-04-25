import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsoleInsert {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No: ");
		int rollNo = sc.nextInt();
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Address: ");
		String address = sc.next();
		System.out.println("Phone No: ");
		int phoneNo = sc.nextInt();
		System.out.println("Age: ");
		int age = sc.nextInt();
		
		String QUERY = "INSERT INTO student " + "VALUES ('" + rollNo + "','" + name + "','" + address 
				+ "','" + phoneNo + "','" + age + "');";	
		System.out.println(QUERY);
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?iseSSL=false", "root", "valks"))
		{
			Statement stat = connection.createStatement();
			{
				int result = stat.executeUpdate(QUERY);
				System.out.println("No. of records affected: " + result);
			}			
		}
		catch (SQLException e)
		{
			printSQLException(e);
		}
	}

	private static void printSQLException(SQLException ex) {
		
		for(Throwable e : ex)
		{
			if(e instanceof SQLException)
			{
				e.printStackTrace(System.err);
			}
		}		
	}

}
