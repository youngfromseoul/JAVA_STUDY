package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private Connection conn;
	
	public Database(String server, String DatabaseName, String user, String password) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}
		StringBuilder conStr = new StringBuilder();    //문자열을 뒤에 붙여줌
		conStr.append("jdbc:sqlserver://" + server + ":1433;"); // mssql port number는 1433
		conStr.append("databaseName = " + DatabaseName + ";");
		conStr.append("user = " + user + ";");
		conStr.append("password = " + password + ";");
		try {
			conn = DriverManager.getConnection(conStr.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}
	public ResultSet ExecuteDataset(String qry) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		try {
			rs = stmt.executeQuery(qry);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}
}
