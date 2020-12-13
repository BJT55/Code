package Team;

public class Teacher extends People{
	public Teacher(String name, String sex, int age) {
		super(name, sex, age);
	}
	
	public void teach(){
		System.out.println(getName()+"指导项目");
	}
}
