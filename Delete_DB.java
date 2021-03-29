package sugang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Delete_DB {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "sugang";
	String password = "green1234";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public Delete_DB(String stu_id, String subject) {

		try {
			connDB();
			String query = "SELECT \"NUM\" FROM LECTURE_CSV WHERE SUBJECT = '" + subject + "'";
			rs = stmt.executeQuery(query);
			System.out.println("SQL : " + query);
			ArrayList<String> list = new ArrayList<String>();

			while (rs.next()) {
				String NUM = rs.getString("NUM");
				list.add(NUM);
			}

			for (String s : list) {
				String query1 = "DELETE list WHERE No = '"+s+"' AND stu_id = '"+stu_id+"'";
				rs = stmt.executeQuery(query1);
				System.out.println(query1);
			}

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
