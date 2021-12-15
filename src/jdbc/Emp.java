package jdbc;
import java.sql.*;

public class Emp
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
            Statement s = con.createStatement();
            String str = "DELETE FROM emp WHERE empname='Rahul'";
            s.executeUpdate(str);
            ResultSet rs = s.executeQuery("SELECT * FROM emp");
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + "  " + rs.getString("empname"));
            }
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}