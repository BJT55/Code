package magazine;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


import java.sql.*;


public class U_Menu extends JFrame {

     static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=magazine";  

	  static final String userName="sa";   // 默认为sa,或者为自己设置的SQLServer身份
	  static final String userPwd="123456";   // 填写你的密码
	private JPanel menuPanel;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//     	           U_Menu frame = new U_Menu();
//					frame.setVisible(true);
//		
//	}

//创建登陆页面
	public U_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 348);
		menuPanel = new JPanel();
		menuPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(menuPanel);
		menuPanel.setLayout(null);


		JButton btnNewButton_1 = new JButton("查询");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//Ask f = new Ask();

			}
		});
		btnNewButton_1.setBounds(220, 100, 120, 28);
		menuPanel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("浏览");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Scan scan = new Scan(2);

			}
		});
		btnNewButton_2.setBounds(220, 150, 120, 25);
		menuPanel.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("用户菜单");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 24));
		lblNewLabel.setBounds(230, 37, 197, 43);
		menuPanel.add(lblNewLabel);

		JButton btnNewButton_3 = new JButton("退出");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//按钮返回登录界面
				dispose();
				Login login = new Login();
			}
		});
		btnNewButton_3.setBounds(220, 200, 120, 25);
		menuPanel.add(btnNewButton_3);
	}
}


