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
	private Font f1 = new Font("����", Font.BOLD, 15);

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
		setTitle("������û ��ȸ");
		setLocationRelativeTo(null);
		setResizable(false);
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);

		lbltarget = new JLabel("�г� ����");
		lbltarget.setBounds(60, 100, 69, 35);
		lbltarget.setFont(f1);
		p.add(lbltarget);

		lblmajor = new JLabel("���� ����");
		lblmajor.setBounds(60, 195, 69, 35);
		lblmajor.setFont(f1);
		p.add(lblmajor);

		lbldivision = new JLabel("����");
		lbldivision.setBounds(60, 290, 69, 35);
		lbldivision.setFont(f1);
		p.add(lbldivision);

		choicet = new Choice();
		choicet.add("����");
		choicet.add("1�г�");
		choicet.add("2�г�");
		choicet.add("3�г�");
		choicet.add("4�г�");
		choicet.setSize(200, 50);
		choicet.setLocation(150, 100);
		p.add(choicet);

		choicemj = new Choice();
		choicemj.add("����");
		choicemj.add("������а�");
		choicemj.add("���б�����");
		choicemj.add("�Ź�����ѱ���ȭ����");
		choicemj.add("��Ʈ���м�����");
		choicemj.add("������������ȭ������");
		choicemj.add("����ȭ�а�");
		choicemj.add("�ΰ����ɼ���Ʈ��������");
		choicemj.add("ġ�����а�");
		choicemj.add("�мǵ������а�");
		choicemj.setSize(200, 50);
		choicemj.setLocation(150, 195);
		p.add(choicemj);

		choicedv = new Choice();
		choicedv.add("����");
		choicedv.add("��������");
		choicedv.add("�����ʼ�");
		choicedv.add("���̹�����");
		choicedv.setSize(200, 50);
		choicedv.setLocation(150, 290);
		p.add(choicedv);

		lookupBtn = new JButton("��ȸ�ϱ�");
		lookupBtn.setBounds(140, 380, 110, 40);
		p.add(lookupBtn);

		setVisible(true);

		lookupBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

//				JOptionPane.showMessageDialog(null, "��ȸ ����");
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