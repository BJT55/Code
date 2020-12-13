package experiment01;

public class HelloABC {
	
	public static void main(String[] args) {
		A a = new A("i ");
		B b = new B("am ");
		C c = new C("happy ");
		
		System.out.print(a.pri1A());
		System.out.print(b.pri1B());
		System.out.println(c.pri1C());
		
		
		System.out.print(A.pri2A());
		System.out.print(B.pri2B());
		System.out.print(C.pri2C());			
	}
}
 
class A{
	public static String a;	
	public A (String a){
		A.a = a;
	}
	
	public String  pri1A(){
		return a ;
	}
	
	public static String pri2A() {
		a=a+",";
		return a;
	}
}

class B{
	public static String b;
	public B (String b){
		B.b = b;
	}
	
	public String  pri1B(){
		return b ;
	}
	
	public static String pri2B() {
		b=b+",";
		return b;
	}
}

class C{
	public static String c;	
	public C (String c){
		C.c = c;
	}
	
	public String  pri1C(){
		return c ;
	}
	
	public static String pri2C() {
		c=c+",";
		return c;
	}
}
 