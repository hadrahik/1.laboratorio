package dos_clases;

public class segundaClase {
	public static void main(String args[]) {
		// Declarando un objeto Entidad
		primeraClase rectangulo;
		
		// Vinculando la clase Entidad con el objeto rectangulo
		rectangulo = new primeraClase();
		
		// Aquí estamos accediendo al método ingresarDatos a través del objeto
		rectangulo.enterData();
		// Aquí estamos accediendo al método calcularArea a través del objeto
		rectangulo.calculateArea();
	}

}

