
public class funciones {
	private static nodo pila;
	private static nodo cola;
	
	public void pila(nodo elemento) {
		if(pila == null) {
			pila = new nodo();
			pila = elemento;
		} else {
			nodo aux = pila;
			pila = elemento;
			pila.sig = aux;
		}
	}
	public void imprimirPila() {
		nodo aux = pila;
		while(aux != null) {
			System.out.println(aux.nombre);
			aux = aux.sig;
		}
	}
	
	public void cola(nodo elemento) {
		if(cola == null) {
			cola = new nodo();
			cola = elemento;
		} else {
			nodo aux = cola;
			while(aux.sig != null) {
				aux = aux.sig;
			}
			aux.sig = elemento;
		}
	}
	public void imprimirCola() {
		nodo aux = cola;
		while(aux != null) {
			System.out.println(aux.nombre);
			aux = aux.sig;
		}
	}
}
