import javax.swing.JOptionPane;

public class Cubo {
    String nombre;
    String textura;
    String dimensiones;
	String accion;
	int durabilidad;
    
    public void crearCubo() {
    	nombre=JOptionPane.showInputDialog("Crea el nombre del cubo");
    	textura=JOptionPane.showInputDialog("Crea la textura del cubo");
    	dimensiones=JOptionPane.showInputDialog("Crea las dimensiones del cubo");
    }
    
    public void crearFuncionesCubo() {
    	accion=JOptionPane.showInputDialog("Crea una accion que cumpla el bloque");
    	durabilidad=Integer.parseInt(JOptionPane.showInputDialog("Crea la durabilidad del bloque"));
    }
    
    public void imprimir() {
    	System.out.println("nombre : "+nombre);
    	System.out.println("textura : "+textura);
    	System.out.println("dimensiones : "+dimensiones);
    	System.out.println("durabilidad : "+durabilidad);
    	System.out.println(accion);
    	
    }
}
