// Write a java program that establishes a connection to mysql  database successfully. 
// If the connection is successful, it should display a message “Connection Established successfully”. 
// In case, it is not able to do so due to any exception, it should display the message “Connection could  not be established “.
// If there is an exception, it should also display the description of the exception.

package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection 
{
	public static void main(String[] args) throws SQLException 
    {
		Connection conn = null;
		try 
		{			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			System.out.println("Connection Established successfully");
		}
		 catch (Exception e) 
        {
			System.out.println("Connection could not be established");
		} 
		finally 
        {
			if (conn != null) conn.close();
		}
	}
}
