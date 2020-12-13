package experiment02;

public class Car {
	private String num;
	private String brand;
	private String color;
	private int price;
	private double weight;

	public Car(String num,String brand,String color,int price,double weight){
		this.num = num;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void carRun(){
		System.out.println("汽车正在行驶");
	}
	public void carStop(){
		System.out.println("汽车停止前进");
	}
	public static void carStar(){
		System.out.println("汽车准备启动");
	}	
	public static void carLife(){
		System.out.println("汽车寿命为五年");
	}	
	public static void carPeople(){
		System.out.println("汽车载客量为四人");
	}
	
	public static void main (String[] args){
		Car car=new Car("陕A37Q86","本田","黑色",300000,1.4);
		System.out.println("汽车牌号："+car.num);
		System.out.println("汽车品牌："+car.brand);
		System.out.println("汽车颜色："+car.color);
		System.out.println("汽车价格（元）："+car.price);
		System.out.println("汽车重量（吨）："+car.weight);
		car.carRun();
		car.carStop();
		carStar();
		carLife();
		carPeople();
	}
    
}

