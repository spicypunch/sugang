package sugang;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sugang.Login_GUI.ID;

public class Main_GUI extends JFrame {

	private JPanel p;
	private JButton sugang, schedule, grades_calc, exit;
	private Font f = new Font("돋움", Font.BOLD, 20);

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Main_GUI frame = new Main_GUI();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//
//	}

	public Main_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setTitle("수강신청");
		setLocationRelativeTo(null);
		setResizable(false);
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);

		sugang = new JButton("수강신청");
		sugang.setFont(f);
		sugang.setBounds(125, 60, 180, 40);
		p.add(sugang);

		schedule = new JButton("내 시간표");
		schedule.setFont(f);
		schedule.setBounds(125, 150, 180, 40);
		p.add(schedule);

		grades_calc = new JButton("수강신청 목록");
		grades_calc.setFont(f);
		grades_calc.setBounds(125, 240, 180, 40);
		p.add(grades_calc);

		exit = new JButton("종료");
		exit.setFont(f);
		exit.setBounds(125, 330, 180, 40);
		p.add(exit);

		setVisible(true);

		sugang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Sugang_GUI frame = new Sugang_GUI();
			}
		});

		schedule.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Schedule_GUI frame = new Schedule_GUI();
			}
		});

		grades_calc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Calc_GUI frame = new Calc_GUI();
			}
		});

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
