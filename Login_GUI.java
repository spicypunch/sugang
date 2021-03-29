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

public class Login_GUI extends JFrame {

	private JPanel p;
	private static JTextField tfstuid;
	private JPasswordField tfpwd;
	private JButton loginBtn, signupBtn;
	private JLabel lblstuid, lblpwd;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI frame = new Login_GUI();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setTitle("�α���");
		setLocationRelativeTo(null);
		setResizable(false);
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p);
		p.setLayout(null);
		
		lblstuid = new JLabel("�й�");
		lblstuid.setBounds(41, 52, 69, 35);
		p.add(lblstuid);
		
		lblpwd = new JLabel("��й�ȣ");
		lblpwd.setBounds(41, 103, 69, 35);
		p.add(lblpwd);
		
		tfstuid = new JTextField();
		tfstuid.setBounds(157, 52, 176, 35);
		p.add(tfstuid);
		tfstuid.setColumns(10);
		
		tfpwd = new JPasswordField();
		tfpwd.setColumns(10);
		tfpwd.setBounds(157, 103, 176, 35);
		p.add(tfpwd);
		
		signupBtn = new JButton("ȸ������");
		signupBtn.setBounds(229, 154, 106, 29);
		p.add(signupBtn);
		
		loginBtn = new JButton("�α���");
		loginBtn.setBounds(108, 154, 106, 29);
		p.add(loginBtn);
		
		setVisible(true);
		
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String stu_id = tfstuid.getText();
				String pwd = tfpwd.getText();
				Login_DB log = new Login_DB(); 
				int result = log.Login_DB(stu_id, pwd);
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "�α��� ����");
					Main_GUI frame = new Main_GUI();
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}
				
			}
		});
		
		signupBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SignUp_GUI frame = new SignUp_GUI();
				dispose();
			}
		});
	}
	static class ID {
		String STU_ID = tfstuid.getText();
	}
}