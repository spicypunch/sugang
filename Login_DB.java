package sugang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login_DB {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "sugang";
	String password = "green1234";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public int Login_DB(String stu_id, String pwd) {

		connDB();

		try {
			String query = "select * from STU_TABLE where STU_ID = '" + stu_id + "' and PWD = '" + pwd + "'";
			rs = stmt.executeQuery(query);
			System.out.println("SQL : " + query);

			if (rs.next()) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return -1; // 로그인 실패
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
