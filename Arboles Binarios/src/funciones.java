
public class funciones {
	private static nodo raiz;

	public void agregar(nodo elemento) {
		if(raiz == null) {
			raiz = new nodo();
			raiz = elemento;
		} else {
			nodo aux = raiz, padre = null;
			while(aux != null) {
				padre = aux;
				if(elemento.num >= aux.num) {
					aux = aux.der;
				} else {
					aux = aux.izq;
				}
			}
			if(elemento.num >= padre.num) {
				padre.der = elemento;
			} else {
				padre.izq = elemento;
			}
		}
	}
	
	public static void preorden(nodo elemento) {
		if(elemento != null) {
			System.out.println(elemento.num);
			preorden(elemento.izq);
			preorden(elemento.der);
		}
	}
	
	public static void postorden(nodo elemento) {
		if(elemento != null) {
			postorden(elemento.izq);
			postorden(elemento.der);
			System.out.println(elemento.num);
		}
	}
	public static void inorden(nodo elemento) {
		if(elemento != null) {
			inorden(elemento.izq);
			System.out.println(elemento.num);
			inorden(elemento.der);
		}
	}
	
	public nodo getRaiz() {
		return raiz;
	}
}
