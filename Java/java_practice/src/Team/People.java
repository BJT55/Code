package Team;

public class People {
	private String name;
	private String sex;
	private int age;
	public People(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void start(String a){
		System.out.println("项目开始时间："+a);
	}
	public static void end(String a){
		System.out.println("项目结束时间："+a);
	}

}
