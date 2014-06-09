import javax.swing.JOptionPane;


public class Arboles_binarios {
	public static void main(String[] args) {
		
		funciones fun = new funciones();
		
		while(true) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de Arboles\n"
					+ "1. agregar datos\n"
					+ "2. imprimir preorden\n"
					+ "3. imprimir postorden\n"
					+ "4. imprimir inorden\n"
					+ "culquier otra tecla para salir"));
			
			switch (opcion) {
			case 1:
				int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
				
				nodo nod = new nodo();
				nod.num = num;
				
				fun.agregar(nod);
				break;
			case 2:
				System.out.println("Imprimiendo por Preorden");
				fun.preorden(fun.getRaiz());
				break;
			case 3:
				System.out.println("Imprimiendo por Postorden");
				fun.postorden(fun.getRaiz());
				break;
			case 4:
				System.out.println("Imprimiendo por inorden");
				fun.inorden(fun.getRaiz());
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}
}
