import javax.swing.JOptionPane;


public class listasSimples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funciones fun = new funciones();
		while(true) {
			
			String miMenu = JOptionPane.showInputDialog("Menu de listas simples\n"
					+ "1. Agregar datos\n"
					+ "2. Imprimir todos los datos\n"
					+ "3. Buscar registro\n"
					+ "4. Modificar registro\n"
					+ "5. Eliminar registro\n"
					+ " otra tecla para salir\n");
			
			switch (miMenu) {
			case "1":
				String nombre = JOptionPane.showInputDialog("ingrese un nombre");
				int cedula = Integer.parseInt(JOptionPane.showInputDialog("ingrese una cedula"));
				
				// estructura de datos del nodo
				nodo aux = new nodo();
				aux.nombre = nombre;
				aux.cedula = cedula;
				
				fun.agregar(aux);
				
				break;
			case "2":
				fun.imprimir();
				break;
			case "3":
				int cedBus = Integer.parseInt(JOptionPane.showInputDialog("ingrese una cedula"));
				if(fun.buscar(cedBus))
					JOptionPane.showMessageDialog(null, "registro encontrado");
				else
					JOptionPane.showMessageDialog(null, "registro no encontrado");
				break;
			case "4":
				int cedMod = Integer.parseInt(JOptionPane.showInputDialog("ingrese una cedula"));
				String nombreNuevo = JOptionPane.showInputDialog("ingrese un nombre");
				int cedNueva = Integer.parseInt(JOptionPane.showInputDialog("ingrese una cedula"));
				
				if(fun.modificar(cedMod, nombreNuevo, cedNueva))
					JOptionPane.showMessageDialog(null, "registro modificado");
				else
					JOptionPane.showMessageDialog(null, "registro no modificado");
				break;
			case "5":
				int cedEli = Integer.parseInt(JOptionPane.showInputDialog("ingrese una cedula"));
				fun.eliminar(cedEli);
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}
}