package clases_con_metodos;

import javax.swing.JOptionPane;

public class claseMetodos {
	public static void main(String args[]) {
		// Asignando el tipo de dato a las variables
		double ladoA;
		double ladoB;
		
		// Utilizando el método ingresarDatos para almacenar los datos en las variables ladoA y ladoB
		ladoA = ingresarDatos("Ingrese la longitud del lado A: ");
		ladoB = ingresarDatos("Ingrese la longitud del lado B: ");
		
		// Pasando los valores de ladoA y ladoB al método calcularArea para realizar la operación
		calcularArea(ladoA, ladoB);
	}

	private static double ingresarDatos(String mensaje) {
		/* Cuando se envían los valores de ladoA y ladoB al método ingresarDatos, se recibe un String que contiene los datos
		 * y se almacena en una variable llamada mensaje. Este valor, que contiene los datos, se convierte y se almacena
		 * en la variable valor, que se devuelve en la línea 29. */
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(cadena);
		return valor;
	}

	private static void calcularArea(double a, double b) {
		// Se reciben los valores de ladoA y ladoB desde el método main, se almacenan en las variables a y b,
		// se multiplican entre sí y se almacenan en la variable resultado. Por último, se imprime resultado en la línea 40.
		double resultado;
		
		resultado = a * b;
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
	}
	// Fin de la clase 
}