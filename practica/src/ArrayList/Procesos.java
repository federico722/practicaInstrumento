package ArrayList;

public class Procesos {
     EjemploArrayList E=new EjemploArrayList();
	public Procesos() {
		
		
		iniciar();
	}
	private void iniciar() {
		E.listaArray();
		E.listaNombres();
		System.out.println(E.listaNumeros);
		System.out.println(E.listaNombres);
		obtener();

	}
	private void obtener() {
		int n=E.listaNumeros.get(1);
		System.out.println(n);
		
	}
	
	
}
