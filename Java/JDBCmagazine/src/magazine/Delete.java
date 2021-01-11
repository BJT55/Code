package magazine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Delete extends JFrame {

	String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	// 加载JDBC驱动
	String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=magazine";
	// 连接服务器和数据库
	String userName = "sa"; // 默认用户名
	String userPwd = "123456"; // 密码
	
    JLabel magLaNum = new JLabel("期刊号：");
    JTextField magTextNum = new JTextField("",20);
    JButton buDelete = new JButton("删除");
    JButton buReturn = new JButton("返回");
    JPanel magPanel = new JPanel();

    public Delete(){
    	magLaNum.setLocation(200,50);
    	magLaNum.setSize(100,50);
    	this.add(magLaNum);
    	
        magTextNum.setLocation(250,55);
        magTextNum.setSize(200,30);
        this.add(magTextNum);
        
        buReturn.setLocation(200,200);
        buReturn.setSize(100,50);
        this.add(buReturn);

        buDelete.setLocation(350,200);
        buDelete.setSize(100,50);
        this.add(buDelete);
        
        buDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = magTextNum.getText();

                Connection conn = null;
                ResultSet res = null;
				Statement stat = null;
				String sql = "delete from journal where mag_num='" + number + "'";   
				
				try {
					Class.forName(driverName);
				} catch (Exception a) {
					a.printStackTrace();
				}
				try {
					conn = DriverManager.getConnection(dbURL, userName, userPwd);
					stat = conn.createStatement();
					stat.executeUpdate(sql);
				} catch (SQLException h) {
					h.printStackTrace();

				} finally {
					try {
						conn.close();
						System.out.println("关闭成功!");
					} catch (SQLException j) {
						System.out.println("关闭失败!");
						j.printStackTrace();
					}
				}
            }
        });
        
		buReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				M_Menu M = new M_Menu();
				M.setVisible(true);
			}
		});
		

		this.setTitle("删除期刊信息");
		this.add(magPanel);
		this.setLocation(500, 200);
		this.setSize(700, 500);
		this.setVisible(true);
		this.setLayout(null);
    }
    

}