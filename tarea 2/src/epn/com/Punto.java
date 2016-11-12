
package epn.com;

public class Punto extends Figura {
	
	private double x;
	private double y;

	public Punto() {
		
		x = 2;
		y = 2;
	}


	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}


	public double setX(double x) {
		return this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	@Override
	public double getArea() {
		
		return 0;
	}


	@Override
	public String toString() {
		return "Punto\n [x=" + x + ", y=" + y + "]";
	}

	
	
}
