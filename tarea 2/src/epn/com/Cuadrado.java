package epn.com;

public class Cuadrado extends Punto {
		
	private double x1;
	private double y2;
	private Punto lados;


	public Cuadrado() {
		super();
		this.x1=2;
		this.y2=2;
		this.lados= new Punto();
	}


	public Cuadrado(double x1, double y2) {
		super();
		x1 = x1;
		this.y2 = y2;
	}

	
	
	public double getX1() {
		return x1;
	}


	public void setX1(double x1) {
		x1 = x1;
	}


	public double getY2() {
		return y2;
	}


	public void setY2(double y2) {
		this.y2 = y2;
	}


	@Override
	public double getArea() {
		
		return super.getX()*super.getY();

	}


	@Override
	public String toString() {
		return "\n\nCuadrado\n [lados"  +  "x=" + super.getX() + ", y=" + super.getY()+",X1=" + x1 + ", y2=" + y2 + "]";
	}



	
	
	
	

}
