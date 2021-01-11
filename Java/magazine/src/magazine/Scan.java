package magazine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

import java.util.*;


public class Scan extends JFrame {

	String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String DB_URL = "jdbc:sqlserver://localhost:1433; DatabaseName=magazine";
	String USER ="sa";
	String PASS = "123456";

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet res = null;

	JButton buttonreturn = new JButton("返回");
	
	


	JTable jtable;
	JScrollPane jscrollpane = new JScrollPane();

	Vector columnNames = null;
	Vector rowData = null;

	public Scan(final int i) {
		
		columnNames = new Vector();
		columnNames.add("期刊号");
		columnNames.add("期刊名");
		columnNames.add("期刊日期");
		columnNames.add("期刊类型");
		columnNames.add("期刊价格");
		rowData = new Vector();



		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			ps = conn.prepareStatement("SELECT * FROM journal");
			res = ps.executeQuery();
			while (res.next()) {
				
				Vector hang = new Vector();
				hang.add(res.getString(1));
				hang.add(res.getString(2));
				hang.add(res.getString(3));
				hang.add(res.getString(4));
				hang.add(res.getString(5));
				rowData.add(hang);
				
			}
			System.out.println("成功载入");
		} catch (Exception q) {
			q.printStackTrace();
			System.out.println("失败");
		} finally {
			try {
				res.close();
				ps.close();
				conn.close();
				System.out.println("成功关闭");
			} catch (SQLException o) {
				o.printStackTrace();
				System.out.println("关闭失败");
			}
		}
		
		buttonreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if( i==1)
				{
					dispose();
					M_Menu M = new M_Menu();
					M.setVisible(true);
				}
				else{
					dispose();
					 U_Menu U = new U_Menu();
					 U.setVisible(true);
				}
			}
		});

		jtable = new JTable(rowData, columnNames);
		jscrollpane = new JScrollPane(jtable);
		getContentPane().add(jscrollpane);
		getContentPane().add(buttonreturn);
		buttonreturn.setBounds(300, 200, 100, 50);
		this.add(jscrollpane);
		this.setTitle("浏览期刊信息");	
		this.setLocation(300, 300);
		this.setSize(700, 500);
		this.setVisible(true);
		this.setResizable(false);

	}


}

