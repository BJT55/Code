package experiment01;

public class Calculator {
	public static void main(String[] args){
		System.out.println(number.add(3.16,5.04));
		System.out.println(number.sub(5.78,1.50));
		System.out.println(number.mul(2.44,0.2));
		System.out.println(number.div(5.44,0.32));
	}

}

class number{
	public static double add(double x,double y){
		return x+y;
	}
	public static double sub(double x,double y){
		return x-y;
	}
	public static double mul(double x,double y){
		return x*y;
	}
	public static double div(double x,double y){
		return x/y;
	}
	
}