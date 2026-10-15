package listas simples;

**/
*Elemento nodo de una lista
*@author Cristopher Gerardo Villaniueva Ramirez
*date 15 octubre 2026
*/

public class Nodo {
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int dato) {
		this. dato = dato;
		this. siguiente = null;
	}
	public int getDato() {
	return dato;
	}
	public void setdato(int dato) {
		this.dato = dato;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.stgutente = siguiente;
	}
}