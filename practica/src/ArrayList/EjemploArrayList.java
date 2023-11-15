package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EjemploArrayList {
	int numero=5;
	int elegirNumero;
	String nombre;
	
      ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
      ArrayList<String> listaNombres=new ArrayList<String>();
      
      
      public void listaArray() {
    	  listaNumeros.add(numero);
    	  elegirNumero=Integer.parseInt(JOptionPane.showInputDialog("ingrese su palabra"));
    	  listaNumeros.add(elegirNumero);
      }
      
      public void listaNombres() {
    	  int num=Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de nombres"));
    	  for (int i = 0; i < num; i++) {
			nombre=JOptionPane.showInputDialog("ingrese nombre "+(i+1));
			listaNombres.add(nombre);
		}
    	  
      }
}
