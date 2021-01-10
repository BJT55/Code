package first;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MainFrame extends JFrame{

	
	private static boolean ture;
	public MainFrame() throws HeadlessException {
		//初始化窗口参数
		initFrame();
		//初始化游戏棋盘
		initGamePanel();
		//初始化蛇
		initSnake();
	}

	private void initSnake() {
	}
	
	private void initGamePanel() {
		JPanel JPanel= new JPanel(){
			//绘制游戏棋盘的内容
			public void paint(Graphics g){    //Graphics相当于画笔
				//绘制横线
				for(int i=0;i<40;i++){
					g.drawLine(0, i*15, 600, i*15);
				}
				//绘制横线
				for(int j=0;j<40;j++){
					g.drawLine(j*15, 0, j*15, 600);
				}
				//绘制蛇
				LinkedList<Node> body =Snake.getBody();
				for(Node node:body){
					g.fillRect(node.getX()*15, node.getY()*15, 15, 15);
				}
				//绘制食物
			}
		};
		//把棋盘添加到窗体中
		add(JPanel);
	}
	//初始化
	private void initFrame(){
		
		setTitle("贪吃蛇游戏");
		setSize(610,640);  //设置窗体宽高
		setLocation(400,400);   //设置窗体位置
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭
		setResizable(false);//设置窗体大小不可变
	}
	public static void main(String[] args){
		//创建窗体对象，并显示

		new MainFrame().setVisible(ture);
	}
}