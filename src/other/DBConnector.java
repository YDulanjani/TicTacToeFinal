package other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnector {
	private static Connection connection;
	private static DBConnector dbConnector;
	
	public DBConnector() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection ("jdbc:mysql://localhost:3306/tictaktoe","root","");
	}
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		if(dbConnector == null){
			dbConnector=new DBConnector();
			
		}
		return connection;
	}
	
	
	
	

}
