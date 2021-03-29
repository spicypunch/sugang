package sugang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Schedule_DB {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "sugang";
	String password = "green1234";
	private Connection con;
	private Statement stmt;
	private Statement stmt1;
	private ResultSet rs;
	private ResultSet rs1;

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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		

	}

	public ArrayList<ScheduleVo> arr(String no) {
		ArrayList<ScheduleVo> arr = new ArrayList<ScheduleVo>();
//		System.out.println("list: "+no);
		try {
//			connDB();
			String query1 = "select SUBJECT, DAY, CLASS_TIME from LECTURE_CSV where NUM = '" + no + "'";
			rs1 = stmt1.executeQuery(query1);
//			System.out.println("SQL : " + query1);

			while (rs1.next()) {
				String subject = rs1.getNString("SUBJECT");
				String day = rs1.getString("DAY");
				int class_time = rs1.getInt("CLASS_TIME");
				ScheduleVo data2 = new ScheduleVo(subject, day, class_time);
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
			stmt1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
