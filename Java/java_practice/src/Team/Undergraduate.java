package Team;

public class Undergraduate extends People {

	public Undergraduate(String name, String sex, int age) {
		super(name, sex, age);
	}
	public void collect(){
		System.out.println(getName()+"(本科生)进行资料收集");
	}

}
