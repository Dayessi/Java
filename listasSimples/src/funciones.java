
public class funciones {
	private static nodo raiz;
	
	public void agregar(nodo elemento) {
		if(raiz == null) {
			raiz = new nodo();
			raiz = elemento;
		} else {
			nodo aux = raiz;
			while(aux.sig != null) {
				aux = aux.sig;
			}
			aux.sig = elemento;
		}
	}
	public void imprimir() {
		nodo aux = raiz;
		while(aux != null) {
			System.out.println(aux.nombre);
			System.out.println(aux.cedula);
			aux = aux.sig;
		}
	}
	public boolean buscar(int cedula) {
		nodo aux = raiz;
		while(aux != null) {
			if(aux.cedula == cedula) {
				return true;
			}
			aux = aux.sig;
		}
		return false;
	}
	public boolean modificar(int cedMod, String nombreNuevo, int cedNueva) {
		nodo aux = raiz;
		while(aux != null) {
			if(aux.cedula == cedMod) {
				aux.nombre = nombreNuevo;
				aux.cedula = cedNueva;
				return true;
			}
			aux = aux.sig;
		}
		return false;
	}
	public boolean eliminar(int cedula) {
		if(raiz.cedula == cedula) {
			raiz = raiz.sig;
			return true;
		} else {
			try {
				nodo aux = raiz;
				while(aux.sig != null) {
					if(aux.sig.cedula == cedula) {
						nodo aux1 = aux.sig;
						aux.sig = aux1.sig;
						return true;
					}
					aux = aux.sig;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return false;
	}
}
