package sugang;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sugang.Login_GUI.ID;

public class Calc_GUI {
	
	public Calc_GUI() {
		Dimension di = new Dimension(430, 490);
		JFrame frame = new JFrame("내 수강신청 목록");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(di);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		ID id = new ID();
		Calc_DB db = new Calc_DB();
		ArrayList<NoVo> list = db.list(id.STU_ID);
		String[] header = {"과목", "학점"};
		DefaultTableModel tableModel;
		tableModel = new DefaultTableModel(header, 0);
		ArrayList<CalcVo> arr = null;
//		String No = null;
		for(int i = 0; i < list.size(); i++) {
			NoVo data1 = (NoVo) list.get(i);
			String No = data1.getNO();
			arr = db.arr(No);
			for(int j = 0; j < 1; j++) {
				Vector<String> row = new Vector<String>();
				row.addElement(arr.get(j).getSubject());
				row.addElement(arr.get(j).getGrades());
				tableModel.addRow(row);
			}
		}

		JTable table = new JTable(tableModel);
		table.setRowHeight(47);
		JScrollPane scroll = new JScrollPane(table);
		
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				int row = table.getSelectedRow();
				int column = 0;
				String value = (String) table.getValueAt(row, column);
				Delete_DB frame = new Delete_DB(id.STU_ID, value);
//			MySugang_GUI frame = new MySugang_GUI();
			}
		});
		
		frame.add(scroll);

		frame.setVisible(true);

	}
}
