package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;



public class DBTesting {
	
	@Test
	public void DBTest() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="test";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="krishna";
		
		Class.forName(DBdriver).newInstance();
		conn= DriverManager.getConnection(url+dbname,userName,password);
		
		PreparedStatement psmt=conn.prepareStatement("select * from emp where sal>? and deptno=?");
		psmt.setString(1,"2000");
		psmt.setString(2,"10");
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=8;i++)
			{
				System.out.print(rs.getString(i)+"   ");
			}
			System.out.println();
		}
		
	}

}
