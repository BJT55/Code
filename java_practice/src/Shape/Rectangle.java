package Shape;

class Rectangle extends Shape{
	private double h;
	private double l;

	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}

	public Rectangle(double h,double l){
		this.h = h;
		this.l = l;
	}
	public double calculateS() {
		return h*l;
	}
	public double calculateC() {
		return 2*(h+l);
	}

}
