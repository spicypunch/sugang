package sugang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Calc_DB {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "sugang";
	String password = "green1234";
	private Connection con;
	private Statement stmt;
//	private Statement stmt1;
	private Statement stmt2;
	private ResultSet rs;
//	private ResultSet rs1;
	private ResultSet rs2;
//	private ArrayList<String> list1 = new ArrayList<String>();

	public ArrayList<NoVo> list(String id) {
		ArrayList<NoVo> list = new ArrayList<NoVo>();
		try {
			connDB();
			String query = "select NO from List where STU_ID = '" + id + "'";
			rs = stmt.executeQuery(query);
			System.out.println("SQL : " + query);

			while (rs.next()) {
				String NO = rs.getString("NO");
				NoVo data1 = new NoVo(NO);
				list.add(data1);
			}
//			for (String n : list) {
//				String query1 = "select SUBJECT_CODE from LECTURE_CSV where NUM = '" + n + "'";
//				rs1 = stmt1.executeQuery(query1);
//				System.out.println("SQL : " + query1);
//
//				String code = rs.getNString("SUBJECT_CODE");
//				list1.add(code);
//
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public ArrayList<CalcVo> arr(String no) {
		ArrayList<CalcVo> arr = new ArrayList<CalcVo>();

		try {

			String query2 = "select SUBJECT, GRADES from LECTURE_CSV where NUM = '" + no + "'";
			rs2 = stmt2.executeQuery(query2);
			System.out.println("SQL : " + query2);

			while (rs2.next()) {
				String subject = rs2.getNString("SUBJECT");
				String grades = rs2.getNString("GRADES");
				CalcVo data2 = new CalcVo(subject, grades);
				arr.add(data2);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return arr;

	}
	
	

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			stmt2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
