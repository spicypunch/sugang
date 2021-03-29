package sugang;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUp_GUI extends JFrame {

	private JPanel p;
	private JLabel lblsignup;
	private JButton CompleteBtn;
	private JTextField tfStuid, tfName, tfEmail, tfPhone;
	private JPasswordField tfpwd;

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUp_GUI frame = new SignUp_GUI();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public SignUp_GUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(430, 490);
		setTitle("ȸ������");
		setLocationRelativeTo(null);
		setResizable(false);
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);

		lblsignup = new JLabel("ȸ������");
		Font f1 = new Font("����", Font.BOLD, 20);
		lblsignup.setFont(f1);
		lblsignup.setBounds(159, 41, 101, 20);
		p.add(lblsignup);

		JLabel label = new JLabel("�й�");
		label.setBounds(69, 113, 69, 20);
		p.add(label);

		JLabel lblUsername = new JLabel("��й�ȣ");
		lblUsername.setBounds(69, 163, 69, 20);
		p.add(lblUsername);

		JLabel lblName = new JLabel("�̸�");
		lblName.setBounds(69, 210, 69, 20);
		p.add(lblName);

		JLabel lblEmail = new JLabel("�̸��� �ּ�");
		lblEmail.setBounds(69, 257, 69, 20);
		p.add(lblEmail);

		JLabel lblPhone = new JLabel("��ȭ��ȣ");
		lblPhone.setBounds(69, 304, 69, 20);
		p.add(lblPhone);

		tfStuid = new JTextField();
		tfStuid.setColumns(10);
		tfStuid.setBounds(159, 106, 186, 35);
		p.add(tfStuid);

		tfpwd = new JPasswordField();
		tfpwd.setColumns(10);
		tfpwd.setBounds(159, 156, 186, 35);
		p.add(tfpwd);

		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(159, 203, 186, 35);
		p.add(tfName);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(159, 250, 186, 35);
		p.add(tfEmail);

		tfPhone = new JTextField();
		tfPhone.setColumns(10);
		tfPhone.setBounds(159, 297, 186, 35);
		p.add(tfPhone);

		CompleteBtn = new JButton("ȸ�����ԿϷ�");
		CompleteBtn.setBounds(206, 363, 139, 29);
		p.add(CompleteBtn);

		setVisible(true);

		// ȸ�����ԿϷ� �׼�(ȸ������ ���� �� ��� �ø�)
		CompleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insert_DB insert = new Insert_DB(tfStuid.getText(),tfpwd.getText(), tfName.getText(), tfEmail.getText(), tfPhone.getText());
				
				JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
				dispose();

//				JOptionPane.showMessageDialog(null, "ȸ�������� �����Ͽ����ϴ�.");
//				

				Login_GUI frame = new Login_GUI();

			}
		});
	}
}