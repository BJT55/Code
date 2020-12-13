package Shape;

class Circle extends Shape {
	private double r;

	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle (double r){
		this.r=r;
	}

	public double calculateS() {
		return Math.PI*r*r;
	}
	public double calculateC() {
		return Math.PI*2*r;
	}

}
