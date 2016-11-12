package epn.com;

import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Apliacion {

	public static void main(String[] args) {
		
		int opc,tipoFigura;
		ArrayList<Figura>listaFiguras=new ArrayList<Figura>();
		
		do{
			tipoFigura= JOptionPane.showOptionDialog(null, "QUE TIPO DE FIGURA DESEA INGRESAR...?", "Tipo Figuras", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "1.Punto","2.Linea","3.Circulo","4.Cuadrado","5.Triangulo"}, "Punto"+"Circulo"+"Cudrado");
			
			switch(tipoFigura){
			case 0:
				listaFiguras.add(new Punto());
				break;
			case 1:
				listaFiguras.add(new Linea());
				break;
			case 2:
				listaFiguras.add(new Circulo());
				
				break;
			case 3:
				listaFiguras.add(new Cuadrado());
				break;
			case 4:
				listaFiguras.add(new Triangulo());
				break;
			}
			opc=JOptionPane.showConfirmDialog(null, "Desea continuar..?","Figura",JOptionPane.YES_NO_OPTION);
		}while(opc==JOptionPane.YES_OPTION);
		String salida="";
		for (Figura figura:listaFiguras){
			
			if(figura.getArea()==0 ){
				salida+=figura.toString()+"\n"+"Area: No Contiene";
			}else if(figura.getArea()!=0){
				salida+=figura.toString()+"\n"+"Area: "+figura.getArea();
			}
			
		}
		JOptionPane.showMessageDialog(null, salida);
	
	}




	}


