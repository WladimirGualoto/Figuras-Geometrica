package epn.com;

public class Triangulo extends Punto {
	
	private double x3;
	private Punto lados;
	
	public Triangulo() {
		super();
		
		this.x3=8;
	}

	public Triangulo(double x3, Punto lados) {
		super();
		this.x3 = x3;
		this.lados = lados;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public Punto getLados() {
		return lados;
	}

	public void setLados(Punto lados) {
		this.lados = lados;
	}
	
	@Override
	public double getArea() {
		
		return (super.getX()*this.x3)/2;

	}


	@Override
	public String toString() {
		return "\n\nTriangulo\n [lados"  +  "x=" + super.getX() + ", y=" + super.getY()+",x3=" + x3 + "]";
	}
	
	
	
	

}
