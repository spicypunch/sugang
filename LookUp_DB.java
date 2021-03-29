package sugang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LookUp_DB {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "sugang";
	String password = "green1234";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	

	public ArrayList<LookUpVo> list(String target, String major, String division) {
		ArrayList<LookUpVo> list = new ArrayList<LookUpVo>();
		
		try {
			connDB();
			String query = "select * from LECTURE_CSV where TARGET = '"+target+"' and MAJOR = '"+major+"' and DIVISION = '"+division+"'";
			rs = stmt.executeQuery(query);
			System.out.println("SQL : " + query);
			
			while(rs.next()) {
				String sc = rs.getString("subject_code");
				String tg = rs.getString("target");
				String mj = rs.getString("major");
				String dv = rs.getString("division");
				String sj = rs.getString("subject");
				String gd = rs.getString("grades");
				String pf = rs.getString("professor");
				String day = rs.getString("day");
				String ct = rs.getString("class_time");
				
				LookUpVo data = new LookUpVo(sc, tg, mj, dv, sj, gd, pf, day, ct);
				list.add(data);
			}
			for(LookUpVo l : list) {
				System.out.println(l);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
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
