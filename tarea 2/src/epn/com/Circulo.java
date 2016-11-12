package epn.com;

public class Circulo extends Punto {
	
	private double radio;
	private Punto centro;
	
	public Circulo() {
		
		this.radio = 2;
		this.centro = new Punto();
	}

	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}


	public Circulo(double x, double y) {
		super(x, y);
		
		x=1;
		y=2;
	}
	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public Punto getCentro() {
		return centro;
	}


	public void setCentro(Punto centro) {
		this.centro = centro;
	}


	@Override
	public double getArea() {
		
		return Math.PI*Math.pow(this.radio,2);
	}

	@Override
	public String toString() {
		return "\n\nCirculo\n[centro"       +         "x=" + super.getX() + ", y=" + super.getY() +"\n[radio=" + radio + "]";
	}

	
	
}

