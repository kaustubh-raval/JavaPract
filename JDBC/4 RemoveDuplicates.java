import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RemoveDuplicates {

public static void main(String[] args) {		
		
		String QUERY = "DELETE t1 FROM newt t1 INNER JOIN newt t2 WHERE t1.id < t2.id AND t1.name = t2.name;";	
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

