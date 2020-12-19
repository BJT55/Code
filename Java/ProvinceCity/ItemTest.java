package ProvinceCity;

import javax.swing.*;
import java.awt.event.*;


public class ItemTest extends JFrame implements ItemListener{

	JComboBox province;   //一级选项，存放省份
	JComboBox city;     //二级选项，存放城市名
	
	public  ItemTest(){
	
		JLabel label1 = new JLabel("请选择省份：");
		label1.setSize(130, 30);
		label1.setLocation(20, 60);
		this.add(label1);
		
		JLabel label2 = new JLabel("请选择城市：");
		label2.setSize(130, 30);
		label2.setLocation(20, 130);
		this.add(label2);
	
		province = new JComboBox();    //设置省份
		String[] pro = getProvinceNames();
		for( int i = 0; i < pro.length; i++){
			province.addItem(pro[i]);
		}
		province.setSize(200, 30);
		province.setLocation(130,60);
		province.addItemListener((ItemListener) this);
		this.add(province);
		
		city = new JComboBox();   //设置城市
		city.setSize(200, 30);
		city.setLocation(130, 130);
		this.add(city);
		
		this.setSize(450,350);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e){
		JComboBox com =(JComboBox)e.getSource();
		String str = com.getSelectedItem().toString();
		String[] province = getCityByProvince(str);
		city.removeAllItems();
		for( int i = 0; i < province.length; i++){
			city.addItem(province[i]);
		}
	}
	
    //获取学院名称
	private String[] getProvinceNames(){
		String[] province = {"河北省","陕西省","山东省","河南省","吉林省"};
		return province;
	}
	
    //获取与学院匹配的专业名称
	private String[] getCityByProvince(String str) {
		String[] city = new String[10];
		if( str.equals("河北省")){
			city[0] = "石家庄";
			city[1] = "秦皇岛";
			city[2] = "保定市";
			city[3] = "唐山市";
			city[4] = "张家口";
			city[5] = "邯郸市";
			city[6] = "承德市";
		}
		if( str.equals("陕西省")){
			city[0] = "西安市";
			city[1] = "咸阳市";
			city[2] = "榆林市";
			city[3] = "宝鸡市";
			city[4] = "金昌市";
			city[5] = "铜川市";
			city[6] = "渭南市";
			city[7] = "汉中市";
		}
		if( str.equals("山东省")){
			city[0] = "潍坊市";
			city[1] = "威海市";
			city[2] = "枣庄市";
			city[3] = "济宁市";
			city[4] = "烟台市";
			city[5] = "德州市";
			city[6] = "莱芜市";
		}
		if( str.equals("河南省")){
			city[0] = "郑州市";
			city[1] = "洛阳市";
			city[2] = "焦作市";
			city[3] = "商丘市";
			city[4] = "信阳市";
			city[5] = "安阳市";
			city[6] = "三门峡";
			city[7] = "周口市";
			city[8] = "驻马店";
			city[9] = "南阳市";
		}
		if( str.equals("吉林省")){
			city[0] = "吉林市";
			city[1] = "通化市";
			city[2] = "白城市";
			city[3] = "四平市";
			city[4] = "辽源市";
			city[5] = "松原市";
			city[6] = "白山市";
		}
		return city;
	}

}
