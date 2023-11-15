package ejercicio4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {

	double altura;
	double base;
	double area;
	String mensaje;
	int msj;
	int i;
	ArrayList<String> listaAreaTrianguloRectangulo=new ArrayList<String>();
	public Procesos() {
		
		areaTrianguloRectangulo();
	}

	private void areaTrianguloRectangulo() {
		mensaje="CALCULAR AREA TRIANGULO RECTANGULO\n\n";
		mensaje+="1.calcular area\n";
		mensaje+="2.imprimir lista areas\n";
		mensaje+="3.salir\n";
		
		
		ciclo();

		
	}

	private void ciclo() {
		do {
			msj=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			opciones(msj);
		} while (msj != 3);
		
	}

	private void opciones(int opcion) {
		switch (opcion) {
		case 1:
		       i++;
			   area();
			   System.out.println(area);
			   listaAreaTrianguloRectangulo.add("Resultado "+(i)+": "+area);
			   
			break;
		case 2:
			System.out.println(listaAreaTrianguloRectangulo);
			break;
         
		case 3:
			JOptionPane.showMessageDialog(null, "Ha salido exitosamente ");
			break;
		default:
			System.out.println("error opcion no encontrada");
			break;
		}
		
	}

	private void area() {
		do {
			altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese altura"));
		} while (altura < 0);
		
		do {
			base=Double.parseDouble(JOptionPane.showInputDialog("ingrese base"));
		} while (base < 0);
		
		
		area=(base*altura)/2;
		
	}
}
