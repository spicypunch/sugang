package sugang;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sugang.Login_GUI.ID;

public class Schedule_GUI {

	public Schedule_GUI() {
		Dimension di = new Dimension(430, 530);
		JFrame frame = new JFrame("시간표");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(di);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		ID id = new ID();
		Schedule_DB db = new Schedule_DB();
		ArrayList<NoVo> list = db.list(id.STU_ID);
		String[] header = { "시간\\요일", "월", "화", "수", "목", "금" };
		String[][] body = 
	        {
	            {"9:00", "", "", "", "", ""},
	            {"10:00", "", "", "", "", ""},
	            {"11:00", "", "", "", "", ""},
	            {"12:00", "", "", "", "", ""},
	            {"13:00", "", "", "", "", ""},
	            {"14:00", "", "", "", "", ""},
	            {"15:00", "", "", "", "", ""},
	            {"16:00", "", "", "", "", ""},
	            {"17:00", "", "", "", "", ""},
	            {"18:00", "", "", "", "", ""},
	        };
		
		JTable table = new JTable(body, header);
		ArrayList<ScheduleVo> arr = null;
		String No = null;
		for(int i = 0; i < list.size(); i++) {
			NoVo data1 = (NoVo) list.get(i);
			No = data1.getNO();
			arr = db.arr(No);
			for(int j = 0; j < 1; j++) {
				if(arr.get(j).getDay().charAt(0)=='월') {
					if(arr.get(j).getClass_time()==1) {
						table.setValueAt(arr.get(j).getSubject(), 1, 1);
					}
					if(arr.get(j).getClass_time()==2) {
						table.setValueAt(arr.get(j).getSubject(), 2, 1);
					}
					if(arr.get(j).getClass_time()==3) {
						table.setValueAt(arr.get(j).getSubject(), 3, 1);
					}
					if(arr.get(j).getClass_time()==4) {
						table.setValueAt(arr.get(j).getSubject(), 4, 1);
					}
					if(arr.get(j).getClass_time()==5) {
						table.setValueAt(arr.get(j).getSubject(), 5, 1);
					}
					if(arr.get(j).getClass_time()==6) {
						table.setValueAt(arr.get(j).getSubject(), 6, 1);
					}
					if(arr.get(j).getClass_time()==7) {
						table.setValueAt(arr.get(j).getSubject(), 7, 1);
					}
					if(arr.get(j).getClass_time()==8) {
						table.setValueAt(arr.get(j).getSubject(), 8, 1);
					}
					if(arr.get(j).getClass_time()==9) {
						table.setValueAt(arr.get(j).getSubject(), 9, 1);
					}
				}
				if(arr.get(j).getDay().charAt(0)=='화') {
					if(arr.get(j).getClass_time()==1) {
						table.setValueAt(arr.get(j).getSubject(), 1, 2);
					}
					if(arr.get(j).getClass_time()==2) {
						table.setValueAt(arr.get(j).getSubject(), 2, 2);
					}
					if(arr.get(j).getClass_time()==3) {
						table.setValueAt(arr.get(j).getSubject(), 3, 2);
					}
					if(arr.get(j).getClass_time()==4) {
						table.setValueAt(arr.get(j).getSubject(), 4, 2);
					}
					if(arr.get(j).getClass_time()==5) {
						table.setValueAt(arr.get(j).getSubject(), 5, 2);
					}
					if(arr.get(j).getClass_time()==6) {
						table.setValueAt(arr.get(j).getSubject(), 6, 2);
					}
					if(arr.get(j).getClass_time()==7) {
						table.setValueAt(arr.get(j).getSubject(), 7, 2);
					}
					if(arr.get(j).getClass_time()==8) {
						table.setValueAt(arr.get(j).getSubject(), 8, 2);
					}
					if(arr.get(j).getClass_time()==9) {
						table.setValueAt(arr.get(j).getSubject(), 9, 2);
					}
				}
				if(arr.get(j).getDay().charAt(0)=='수') {
					if(arr.get(j).getClass_time()==1) {
						table.setValueAt(arr.get(j).getSubject(), 1, 3);
					}
					if(arr.get(j).getClass_time()==2) {
						table.setValueAt(arr.get(j).getSubject(), 2, 3);
					}
					if(arr.get(j).getClass_time()==3) {
						table.setValueAt(arr.get(j).getSubject(), 3, 3);
					}
					if(arr.get(j).getClass_time()==4) {
						table.setValueAt(arr.get(j).getSubject(), 4, 3);
					}
					if(arr.get(j).getClass_time()==5) {
						table.setValueAt(arr.get(j).getSubject(), 5, 3);
					}
					if(arr.get(j).getClass_time()==6) {
						table.setValueAt(arr.get(j).getSubject(), 6, 3);
					}
					if(arr.get(j).getClass_time()==7) {
						table.setValueAt(arr.get(j).getSubject(), 7, 3);
					}
					if(arr.get(j).getClass_time()==8) {
						table.setValueAt(arr.get(j).getSubject(), 8, 3);
					}
					if(arr.get(j).getClass_time()==9) {
						table.setValueAt(arr.get(j).getSubject(), 9, 3);
					}
				}
				if(arr.get(j).getDay().charAt(0)=='목') {
					if(arr.get(j).getClass_time()==1) {
						table.setValueAt(arr.get(j).getSubject(), 1, 4);
					}
					if(arr.get(j).getClass_time()==2) {
						table.setValueAt(arr.get(j).getSubject(), 2, 4);
					}
					if(arr.get(j).getClass_time()==3) {
						table.setValueAt(arr.get(j).getSubject(), 3, 4);
					}
					if(arr.get(j).getClass_time()==4) {
						table.setValueAt(arr.get(j).getSubject(), 4, 4);
					}
					if(arr.get(j).getClass_time()==5) {
						table.setValueAt(arr.get(j).getSubject(), 5, 4);
					}
					if(arr.get(j).getClass_time()==6) {
						table.setValueAt(arr.get(j).getSubject(), 6, 4);
					}
					if(arr.get(j).getClass_time()==7) {
						table.setValueAt(arr.get(j).getSubject(), 7, 4);
					}
					if(arr.get(j).getClass_time()==8) {
						table.setValueAt(arr.get(j).getSubject(), 8, 4);
					}
					if(arr.get(j).getClass_time()==9) {
						table.setValueAt(arr.get(j).getSubject(), 9, 4);
					}
				}
				if(arr.get(j).getDay().charAt(0)=='금') {
					if(arr.get(j).getClass_time()==1) {
						table.setValueAt(arr.get(j).getSubject(), 1, 5);
					}
					if(arr.get(j).getClass_time()==2) {
						table.setValueAt(arr.get(j).getSubject(), 2, 5);
					}
					if(arr.get(j).getClass_time()==3) {
						table.setValueAt(arr.get(j).getSubject(), 3, 5);
					}
					if(arr.get(j).getClass_time()==4) {
						table.setValueAt(arr.get(j).getSubject(), 4, 5);
					}
					if(arr.get(j).getClass_time()==5) {
						table.setValueAt(arr.get(j).getSubject(), 5, 5);
					}
					if(arr.get(j).getClass_time()==6) {
						table.setValueAt(arr.get(j).getSubject(), 6, 5);
					}
					if(arr.get(j).getClass_time()==7) {
						table.setValueAt(arr.get(j).getSubject(), 7, 5);
					}
					if(arr.get(j).getClass_time()==8) {
						table.setValueAt(arr.get(j).getSubject(), 8, 5);
					}
					if(arr.get(j).getClass_time()==9) {
						table.setValueAt(arr.get(j).getSubject(), 9, 5);
					}
				}
//				row.addElement(arr.get(j).getSubject());
//				row.addElement(arr.get(j).getDay());
//				row.addElement(arr.get(j).getClass_time());
//				tableModel.addRow(row);
//				System.out.println(arr.get(j).getDay());
			}
			
		}
		
		
		
		table.setRowHeight(47);
		JScrollPane scroll = new JScrollPane(table);
		
		frame.add(scroll);

		frame.setVisible(true);

	}
}
