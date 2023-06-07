package clases_sin_metodos;

import javax.swing.JOptionPane;

public class sinMetodos {
	public static void main(String []args) {
		//Asignando el tipo de dato a las variables
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		//Parceando la variable cadena a double y almacenando en ladoA
		cadena= JOptionPane.showInputDialog(null,"Ingrese la longitud del lado A:");
		ladoA = Double.parseDouble(cadena);
		
		//Parceando la variable cadena a double y almacenando en ladoB
		cadena= JOptionPane.showInputDialog(null,"Ingrese la longitud del lado B:");
		ladoB = Double.parseDouble(cadena);
		
		//Realizamos la operación multiplicando ladoA por ladoB, la operación se almacena en la variable resultado
		//y se imprime utilizando JOptionPane.
		resultado= ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
	}
	//Fin de la clase Aplicación

		
}