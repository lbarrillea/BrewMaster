package ConsoleApp;

import java.sql.Connection;

public class SQL_Connectordata {
	
	public static Connection getConnection() throws SQLException, ClassNotFound {
		
		Class.forName("ruby.db.elephantsql.com (ruby-01)");
		
		String url = "postgres://gjqmooee:c4coG2xxK9FpVIzs_0bCefDb7MYSgPH9@ruby.db.elephantsql.com:5432/gjqmooee ";
		String user = "lbarrillea@gmail.com";
		String password = "StarWars1977!";
		
		return Connection.getConnection(url, user, password);
	}
	
	public static void closeConnection(Connection connection) throws SQLException{
		connection.close();
	}
}
	


