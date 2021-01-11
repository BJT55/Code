package magazine;


import java.awt.Font;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class Login extends JFrame {
	
public Login()
{	
	JPanel plogin = new JPanel();
	
	JLabel Lab0 = new JLabel("欢迎进入期刊信息管理界面");
	Lab0.setFont(new Font("宋体", Font.PLAIN, 20));
	Lab0.setBounds(220, 30, 400, 50);
	this.add(Lab0);
	final JRadioButton  blogin1 = new JRadioButton ("管理员");
//	blogin1.setBounds(150, 30, 80, 50);

	final JRadioButton blogin2 = new JRadioButton("用户");
//	blogin2.setBounds(350, 30, 80, 50);

	
	final JPanel panel =new JPanel();
	panel.add(blogin1);
	panel.add(blogin2);
	panel.setSize(150,150);
	panel.setLocation(250, 100);
	this.add(panel);
	
	JLabel Lab1 = new JLabel("ID:");
	Lab1.setBounds(150, 190, 100, 50);
	this.add(Lab1);
	JLabel Lab2 = new JLabel("PASSWD:");
	Lab2.setBounds(150, 240, 100, 50);
	this.add(Lab2);
	
	final JTextField lName = new JTextField("", 20);
	lName.setBounds(280, 200, 250, 30);
	this.add(lName);
	final JTextField lPasswd = new JTextField("", 20);
	lPasswd.setBounds(280,250 ,250, 30);
	this.add(lPasswd);
	
	final JButton but1 = new JButton ("登录");
	but1.setBounds(150, 350, 100, 50);
	this.add(but1);
	JButton but2 = new JButton ("退出");
	but2.setBounds(380,350, 100, 50);
	this.add(but2);
	
	this.add(plogin);

	blogin1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			 panel.removeAll();
					but1.addActionListener(new ActionListener(){					
					public void actionPerformed(ActionEvent e) {
						if(lName.getText().equals("root")&&lPasswd.getText().equals("123")){
							dispose();
							M_Menu M = new M_Menu();
							M.setVisible(true);}
						else{
								JOptionPane.showMessageDialog(null, "密码出错或输入不合法");
							}
					}
					});
				
				}
			});
	
	blogin2.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e) {
			 
			 panel.removeAll();
				but1.addActionListener(new ActionListener(){					
					public void actionPerformed(ActionEvent e) {
						if(lName.getText().equals("user")&&lPasswd.getText().equals("123"))
						{
							 dispose();
							 
							 U_Menu U = new U_Menu();
							 U.setVisible(true);
						}
						else{
							JOptionPane.showMessageDialog(null, "密码出错或输入不合法");
						}
					}
					});
			 
		 }
		});

	but2.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {
			System.exit(1);		
		}});
		
	this.setTitle("期刊信息管理系统");
	this.setSize(700, 500);	
	this.setLocation(500, 200);
	this.add(plogin);
	this.setVisible(true);

}

public static void main(String[] args)
{
	Login L = new Login();
}

}
