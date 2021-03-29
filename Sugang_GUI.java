package sugang;

import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Sugang_GUI extends JFrame {

	private JPanel p;
	private JLabel lbltarget, lblmajor, lbldivision;
	static Choice choicet;
	static Choice choicemj;
	static Choice choicedv;
	private JButton lookupBtn;
	private Font f1 = new Font("돋움", Font.BOLD, 15);

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Sugang_GUI frame = new Sugang_GUI();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public Sugang_GUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(430, 490);
		setTitle("수강신청 조회");
		setLocationRelativeTo(null);
		setResizable(false);
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);

		lbltarget = new JLabel("학년 선택");
		lbltarget.setBounds(60, 100, 69, 35);
		lbltarget.setFont(f1);
		p.add(lbltarget);

		lblmajor = new JLabel("전공 선택");
		lblmajor.setBounds(60, 195, 69, 35);
		lblmajor.setFont(f1);
		p.add(lblmajor);

		lbldivision = new JLabel("과목");
		lbldivision.setBounds(60, 290, 69, 35);
		lbldivision.setFont(f1);
		p.add(lbldivision);

		choicet = new Choice();
		choicet.add("공통");
		choicet.add("1학년");
		choicet.add("2학년");
		choicet.add("3학년");
		choicet.add("4학년");
		choicet.setSize(200, 50);
		choicet.setLocation(150, 100);
		p.add(choicet);

		choicemj = new Choice();
		choicemj.add("공통");
		choicemj.add("국어국문학과");
		choicemj.add("수학교육과");
		choicemj.add("신문방송한국문화전공");
		choicemj.add("아트앤패션전공");
		choicemj.add("에너지·응용화학전공");
		choicemj.add("응용화학과");
		choicemj.add("인공지능소프트웨어전공");
		choicemj.add("치위생학과");
		choicemj.add("패션디자인학과");
		choicemj.setSize(200, 50);
		choicemj.setLocation(150, 195);
		p.add(choicemj);

		choicedv = new Choice();
		choicedv.add("교양");
		choicedv.add("전공선택");
		choicedv.add("전공필수");
		choicedv.add("사이버강의");
		choicedv.setSize(200, 50);
		choicedv.setLocation(150, 290);
		p.add(choicedv);

		lookupBtn = new JButton("조회하기");
		lookupBtn.setBounds(140, 380, 110, 40);
		p.add(lookupBtn);

		setVisible(true);

		lookupBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

//				JOptionPane.showMessageDialog(null, "조회 성공");
				LookUp_GUI frame = new LookUp_GUI();

			}
		});
	}
	static class Hochool {
		String target = choicet.getSelectedItem();
		String major = choicemj.getSelectedItem();
		String division = choicedv.getSelectedItem();
	}

}