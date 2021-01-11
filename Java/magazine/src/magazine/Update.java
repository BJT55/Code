package magazine;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;


public class Update extends JFrame {

	String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String DB_URL =  "jdbc:sqlserver://localhost:1433; DatabaseName=magazine";
	String USER = "sa";
	String PASS = "123456";

	JLabel jlnumber = new JLabel("期刊号：");
	JLabel jlname = new JLabel("期刊名：");
	JLabel jlyear = new JLabel("期刊日期：");
	JLabel jltype = new JLabel("期刊类型：");
	JLabel jlprice = new JLabel("期刊价格：");
	JLabel jlselect_num = new JLabel("请输入所要更改的期刊号：");

	JTextField jtnumber = new JTextField("", 20);
	JTextField jtname = new JTextField("", 20);
	JTextField jtyear = new JTextField("", 20);
	JTextField jttype = new JTextField("", 20);
	JTextField jtprice = new JTextField("", 20);
	JTextField jtselect_num = new JTextField("", 20);

	JButton buttonchange = new JButton("确定修改");
	JButton buttonreturn = new JButton("取消返回");
	JPanel jpanel = new JPanel();

	public Update() {

		jlselect_num.setBounds(100, 20, 200, 30);
		this.add(jlselect_num);
		jlnumber.setBounds(100, 70, 100, 30);
		this.add(jlnumber);
		jlname.setBounds(100, 120, 100, 30);
		this.add(jlname);
		jlyear.setBounds(100, 170, 100, 30);
		this.add(jlyear);
		jltype.setBounds(100, 220, 100, 30);
		this.add(jltype);
		jlprice.setBounds(100, 270, 100, 30);
		this.add(jlprice);
		
		jtselect_num.setBounds(250, 20, 250, 30);
		this.add(jtselect_num);
		jtnumber.setBounds(200, 70, 300, 30);
		this.add(jtnumber);
		jtname.setBounds(200, 120, 300, 30);
		this.add(jtname);
		jtyear.setBounds(200, 170, 300, 30);
		this.add(jtyear);
		jttype.setBounds(200, 220, 300, 30);
		this.add(jttype);
		jtprice.setBounds(200, 270, 300, 30);
		this.add(jtprice);
		
		buttonchange.setBounds(100, 350, 100, 50);
		this.add(buttonchange);
		buttonreturn.setBounds(450, 350, 100, 50);
		this.add(buttonreturn);

		buttonreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				M_Menu M = new M_Menu();
				M.setVisible(true);
			}
		});

		buttonchange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String select_num = jtselect_num.getText();
				String num = jtnumber.getText();
				String name = jtname.getText();
				String year = jtyear.getText();
				String type = jttype.getText();
				String price = jtprice.getText();


				Connection conn = null;
				ResultSet res = null;
				Statement stat = null;

				try {
					Class.forName(JDBC_DRIVER);

				} catch (Exception d) {
					System.out.println("连接失败");
					d.printStackTrace();
				}
				try {
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					stat = conn.createStatement();
					while (select_num != null) {

							String sql1 = "update journal set mag_num='" + num + "'  where mag_num='" + select_num
									+ "'";
							String sql2 = "update journal set mag_name='" + name + "'  where mag_num='" + select_num
									+ "'";
							String sql3 = "update journal set mag_year='" + year + "'  where mag_num='" + select_num
									+ "'";
							String sql4 = "update journal set mag_type='" + type + "'  where mag_num='" + select_num
									+ "'";
							String sql5 = "update journal set mag_price='" + price + "'  where mag_num='" + select_num
									+ "'";

							try {
								conn = DriverManager.getConnection(DB_URL, USER, PASS);
								stat = conn.createStatement();

								stat.executeUpdate(sql2);
								stat.executeUpdate(sql3);
								stat.executeUpdate(sql4);
								stat.executeUpdate(sql5);
								stat.executeUpdate(sql1);
							} catch (SQLException g) {
								// TODO Auto-generated catch block
								g.printStackTrace();
							}
							try {
								stat.close();
								conn.close();
							} catch (SQLException ar) {
								ar.printStackTrace();
							}
							break;
						}
						// change end

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						conn.close();
						JOptionPane.showMessageDialog(null, "修改成功！");
					} catch (SQLException ar) {
						ar.printStackTrace();
					}
				}
			}
		});
		this.setTitle("更新期刊信息");
		this.add(jpanel);
		this.setLocation(500, 200);
		this.setSize(700, 500);
		this.setVisible(true);
		this.setLayout(null);

	}

}
