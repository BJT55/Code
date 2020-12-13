package Team;

public class Postgraduate extends People{

	public Postgraduate(String name, String sex, int age) {
		super(name, sex, age);
	}
	public void design(){
		System.out.println(getName()+"(研究生)进行编码设计");
	}

}
