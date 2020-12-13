package Team;

public class Teamwork {
	public static void main(String[] args){
		Teacher teacher=new Teacher("李老师","男",42);
		Postgraduate post1=new Postgraduate("张三","男",23);
		Postgraduate post2=new Postgraduate("李琦","女",22);
		Undergraduate under=new Undergraduate("王悦","女",20);
		People.end("2020.11.28");
		People.start("2020.10.28");
	    teacher.teach();
		post1.design();
		post2.design();
		under.collect();
	}

}
