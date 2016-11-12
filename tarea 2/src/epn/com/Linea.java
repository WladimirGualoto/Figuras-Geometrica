package epn.com;

public class Linea extends Punto{

	Punto p1;
	Punto p2;
	
	public Linea() {
		super();
		p1=new Punto();
		p2= new Punto();
	}
	public Linea(int x, int y) {
		super(x, y);
		
	}
	public Linea(Punto p1, Punto p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	public Punto getp1() {
		return p1;
	}
	public void setp1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getp2() {
		return p2;
	}
	public void setCoord2(Punto coord2) {
		this.p2 = coord2;
	}
	
	@Override
	public String toString() {
		return "\n\nLinea\n [coord1=" + p1.toString() + "\n, coord2=" + p2.toString() + "]";
				
	}		
}
