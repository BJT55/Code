package first;

import java.util.LinkedList;

//一条蛇是有许多节点组成
public class Snake {
	//蛇身
	private static LinkedList<Node> body;
	
	//创建方法，在创建Snake对象时执行
	public Snake(){
		//初始化蛇身
		initSnake();
	}

	private void initSnake() {
		//创建集合
		body=new LinkedList<Node>();
		//创建6个结点，添加到集合中
		body.add(new Node (16,20));
		body.add(new Node (17,20));
		body.add(new Node (18,20));
		body.add(new Node (19,20));
		body.add(new Node (20,20));
		body.add(new Node (21,20));
	}
	public static  LinkedList<Node> getBody() {
		return body;
	}
	public void setBody(LinkedList<Node> body){
		Snake.body=body;
	}

}
