import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlJoin {

private static final String QUERY = "select student.roll_no, student.name, course.course_id from student inner join course on student.roll_no = course.roll_no;";
	
	public static void main(String[] args) {
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc?iseSSL=false", "root", "valks"))
		{
			Statement stat = connection.createStatement();
			
			ResultSet results = stat.executeQuery(QUERY);
			System.out.println("Roll No, Name, Course ID");			
			while(results.next())
			{
				int id = results.getInt("roll_no");
				String name = results.getString("name");
				int course_id= results.getInt("course_id");				
				System.out.println(id + ",       " + name + ",    " + course_id);				
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
