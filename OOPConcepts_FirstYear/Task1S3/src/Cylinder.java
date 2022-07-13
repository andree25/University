
class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {
		super();
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return getArea() * height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getVolume()=" + getVolume() + ", getRadius()=" + getRadius()
				+ ", getColor()=" + getColor() + ", getArea()=" + getArea() + "]";
	}
}