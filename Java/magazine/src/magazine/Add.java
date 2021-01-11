package magazine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Add extends JFrame{

	JLabel jnamel = new JLabel("期刊名称 ");
	JLabel jnol = new JLabel("期 刊 号 ");
	JLabel jyearl = new JLabel("期刊年份");
	JLabel jthemel = new JLabel("期刊主题");
	JLabel jpricel = new JLabel("期刊价格");

	JTextField jnamet = new JTextField("", 20);
	JTextField jnot = new JTextField("", 20);
	JTextField jyeart = new JTextField("", 20);
	JTextField jthemet = new JTextField("", 20);
	JTextField jpricet = new JTextField("", 20);

	JButton buttonadd = new JButton("添加");
	JButton buttonreturn = new JButton("返回");

	public Add() {
		JPanel jnamep = new JPanel();
		jnamep.setLocation(50,20);
		jnamep.setSize(300,30);
		JPanel jnop = new JPanel();
		jnop.setLocation(50,60);
		jnop.setSize(300,30);
		JPanel jyearp = new JPanel();
		jyearp.setLocation(50,100);
		jyearp.setSize(300,30);
		JPanel jthemep = new JPanel();
		jthemep.setLocation(50,140);
		jthemep.setSize(300,30);
		JPanel jpricep = new JPanel();
		jpricep.setLocation(50,180);
		jpricep.setSize(300,30);

		jnamep.add(jnamel);
		jnamep.add(jnamet);
		
		jnop.add(jnol);
		jnop.add(jnot);

		jyearp.add(jyearl);
		jyearp.add(jyeart);

		jthemep.add(jthemel);
		jthemep.add(jthemet);
		
		jpricep.add(jpricel);
		jpricep.add(jpricet);

		this.setTitle("添加期刊信息");
		getContentPane().setLayout(null);
		getContentPane().add(jnamep);
		getContentPane().add(jnop);
		getContentPane().add(jyearp);
		getContentPane().add(jthemep);
		getContentPane().add(jpricep);

		buttonadd.setSize(130,30);
		buttonadd.setLocation(50,240);
		getContentPane().add(buttonadd);
		buttonreturn.setSize(130,30);
		buttonreturn.setLocation(200,240);
		getContentPane().add(buttonreturn);

	
		buttonreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				M_Menu M = new M_Menu();
				M.setVisible(true);
			}
		});
		
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
				String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=magazine";  // 为数据库名，此处填写你的数据库名

				String userName="sa";   // 默认为sa,或者为自己设置的SQLServer身份
				String userPwd="123456";   // 填写你的密码

				// Add
				Connection conn = null;
				java.sql.Statement stat = null;
				//PreparedStatement ps = null;
				try {
					Class.forName(driverName);

					// 打开链接
					System.out.println("连接数据库...");
					conn = DriverManager.getConnection(dbURL, userName, userPwd);

					StringBuffer strSql=new StringBuffer();
					strSql.append("insert into journal values('");
					strSql.append(jnamet.getText());
					strSql.append("','");
					strSql.append(jnot.getText());
					strSql.append("','");
					strSql.append(jyeart.getText());
					strSql.append("','");
					strSql.append(jthemet.getText());
					strSql.append("','");
					strSql.append(jpricet.getText());
					strSql.append("')");
					Statement st=conn.createStatement();
					//创建SQL语句执行对象
					st.execute(strSql.toString());
					//执行SQL语句
					st.close();
					conn.close(); 

				} catch (SQLException b) {
					b.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						conn.close();
						System.out.println("关闭成功");
					} catch (SQLException c) {
						System.out.println("关闭失败 ");
						c.printStackTrace();
					}
				}
			}
		});
		this.setLocation(400,300);
		this.setSize(400,350);
		this.setVisible(true);
	}

}
