package sugang;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sugang.Login_GUI.ID;
import sugang.Sugang_GUI.Hochool;

public class LookUp_GUI extends JFrame {

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LookUp_GUI frame = new LookUp_GUI();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public LookUp_GUI() {

		Hochool ho = new Hochool();
		LookUp_DB lu = new LookUp_DB();
		ArrayList<LookUpVo> list = lu.list(ho.target, ho.major, ho.division);
		Dimension di = new Dimension(750, 490);
		JFrame frame = new JFrame("조회 ※강의 코드 번호가 같은 항목은 똑같은 강의 입니다.");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(di);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		String[] header = { "강의코드", "학년", "전공", "분류", "과목", "학점", "교수", "요일", "시간" };
		DefaultTableModel tableModel;
		tableModel = new DefaultTableModel(header, 0);
		for (int i = 0; i < list.size(); i++) {
//			LookUpVo data = (LookUpVo) list.get(i);
			Vector<String> row = new Vector<String>();
			row.addElement(list.get(i).getSubCode());
			row.addElement(list.get(i).getTarget());
			row.addElement(list.get(i).getMajor());
			row.addElement(list.get(i).getDivision());
			row.addElement(list.get(i).getSubject());
			row.addElement(list.get(i).getGrades());
			row.addElement(list.get(i).getProfessor());
			row.addElement(list.get(i).getDay());
			row.addElement(list.get(i).getClass_time());
			tableModel.addRow(row);
//			String tg = data.getTarget();
//			String mj = data.getMajor();
//			String dv = data.getDivision();
//			String sj = data.getSubject();
//			String gd = data.getGrades();
//			String pf = data.getProfessor();
//			String day = data.getDay();
//			String ct = data.getClass_time();
//			header = new String {tg, mj, dv, sj, gd, pf, day, ct};
		}

//		String[][] res = new String[list.size()][header.length];
		JTable table = new JTable(tableModel);
		table.setRowHeight(47);
		JScrollPane scroll = new JScrollPane(table);

		ID id = new ID();
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				int row = table.getSelectedRow();
				int column = 0;
				String value = (String) table.getValueAt(row, column);
				SugangInsert_DB frame = new SugangInsert_DB(id.STU_ID, value);
//			MySugang_GUI frame = new MySugang_GUI();
			}
		});

		frame.add(scroll);
//		frame.pack();
		frame.setVisible(true);

	}
}