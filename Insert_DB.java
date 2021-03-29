package sugang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Insert_DB {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "sugang";
	String password = "green1234";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	
	public Insert_DB(String STU_ID, String PWD, String NAME, String EMAIL, String PHONE) {
		
		try {
			connDB();

			String query = "insert into STU_TABLE values ('"+STU_ID+"', '"+PWD+"', '" +NAME+"', '"+ EMAIL+"', '" +PHONE+"')";
			rs = stmt.executeQuery(query);
			System.out.println("SQL : " + query);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}