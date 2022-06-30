package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException{
		//como deve ser:
		/*String url = "jdbc:mysql://localhost/test";*/
		String url = "jdbc:mysql://localhost/av2";
		String user = "root";
		String password = ""; 
		return DriverManager.getConnection(url, user, password);
	}

}
