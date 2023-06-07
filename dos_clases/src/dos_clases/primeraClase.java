package dos_clases;

import javax.swing.JOptionPane;

public class primeraClase {
	// Asignación de dos variables y asignando su estado para ser visible en otras clases
		private double ladoA;
		private double ladoB;
		
		// Creamos el método enterData en el cual solicitamos y convertimos dos datos, ladoA y ladoB
		public void enterData() {
			String cadena;
			
			cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A:");
			ladoA = Double.parseDouble(cadena);
			
			cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado B:");
			ladoB = Double.parseDouble(cadena);
		}

		// Creamos un método calculateArea en el cual llega la información de ladoA y ladoB.
		// Gracias a esto, se lleva a cabo la operación y se almacena en la variable resultado.
		// Posteriormente, la variable resultado se imprime en la línea 29.
		public void calculateArea() {
			double resultado; 
			
			resultado = ladoA * ladoB;
			
			JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
		}

	}
