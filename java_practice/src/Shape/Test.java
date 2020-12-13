package Shape;

public class Test {

	public static void main(String[] args) {
		Circle circle = new Circle (4);
		Triangle triangle = new Triangle (3);
		Rectangle rectangle=new Rectangle (2.4,4.0);
		System.out.println("圆形的周长为："+circle.calculateC());
		System.out.println("圆形的面积为："+circle.calculateS());
		System.out.println("长方形的周长为："+rectangle.calculateC());
		System.out.println("长方形的面积为："+rectangle.calculateS());
		System.out.println("等边三角形的周长为："+triangle.calculateC());
		System.out.println("等边三角形的面积为："+triangle.calculateS());
	}

}
