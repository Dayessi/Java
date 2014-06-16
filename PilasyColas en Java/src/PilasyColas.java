import javax.swing.JOptionPane;


public class PilasyColas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funciones fun = new funciones();

		while(true) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de Pilas y Colas\n"
					+ "1. Agregar\n"
					+ "2. Imprimir Pila\n"
					+ "3. Imprimir Cola\n"
					+ "otra numero para salir"));
			
			switch (opcion) {
			case 1:
				String nombre = JOptionPane.showInputDialog("Ingrese un nombre");
				
				nodo nodP = new nodo();
				nodP.nombre = nombre;
				fun.pila(nodP);
				
				nodo nodC = new nodo();
				nodC.nombre = nombre;
				fun.cola(nodC);
							
				break;
			case 2:
				System.out.println("Impresion por Pila");
				fun.imprimirPila();
				break;
			case 3:
				System.out.println("Impresion por Cola");
				fun.imprimirCola();
				break;
			default:
				System.exit(0);
				break;
			}
		
		}
		
	}
}
