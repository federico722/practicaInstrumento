package ejercicio2;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

	public Procesos() {
		 String input = JOptionPane.showInputDialog("Ingrese la cantidad de meses a calcular:");
	        int numMeses = Integer.parseInt(input);

	        // HashMap para almacenar las ventas mensuales
	        HashMap<String, Double> ventasMensuales = new HashMap<>();

	        // Ingreso de las ventas mensuales
	        for (int i = 1; i <= numMeses; i++) {
	            String mes = "Mes " + i;
	            input = JOptionPane.showInputDialog("Ingrese las ventas del " + mes + ":");
	            double ventas = Double.parseDouble(input);
	            ventasMensuales.put(mes, ventas);
	        }

	        // Cálculo del promedio mensual
	        double totalVentas = 0;
	        for (double ventas : ventasMensuales.values()) {
	            totalVentas += ventas;
	        }
	        double promedioMensual = totalVentas / numMeses;

	        // Encontrar el mes con las ventas más altas y más bajas manualmente
	        String mesMasAlto = null;
	        String mesMasBajo = null;

	        /*
	         * En resumen, estas dos líneas juntas están recorriendo cada mes en
	         *  el HashMap ventasMensuales, y para cada mes, están extrayendo el
	         *   valor de las ventas asociado a ese mes. Esto se hace dentro del 
	         *   bucle for-each, y se repite para cada mes en el HashMap.
	         *    Este enfoque te permite examinar cada mes y comparar las ventas para
	         *     encontrar el mes con las ventas más altas y más bajas.
	         */
	         
	        for (String mes : ventasMensuales.keySet()) {
	            double ventas = ventasMensuales.get(mes);
	            

	            // Encontrar el mes con las ventas más altas
	            if (mesMasAlto == null || ventas > ventasMensuales.get(mesMasAlto)) {
	                mesMasAlto = mes;
	            }

	            // Encontrar el mes con las ventas más bajas
	            if (mesMasBajo == null || ventas < ventasMensuales.get(mesMasBajo)) {
	                mesMasBajo = mes;
	            }
	        }

	        // Mostrar resultados
	        String resultados = "Resultados:\n" +
	                "Promedio mensual de ventas: " + promedioMensual + "\n" +
	                "Mes con las ventas más altas: " + mesMasAlto + " con " + ventasMensuales.get(mesMasAlto) + " ventas\n" +
	                "Mes con las ventas más bajas: " + mesMasBajo + " con " + ventasMensuales.get(mesMasBajo) + " ventas";

	        JOptionPane.showMessageDialog(null, resultados);
	}
}
