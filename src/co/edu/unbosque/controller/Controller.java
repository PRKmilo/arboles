package co.edu.unbosque.controller;

import co.edu.unbosque.model.Estructura;
import co.edu.unbosque.model.Nodo;

public class Controller {
	private Estructura arbol;
	private Nodo nodo;
	public Controller() {
		arbol=new Estructura();
		funcionar();
	}
	
	public void funcionar() {
		arbol.insertar(4, "4");
		arbol.insertar(3,"3");
		arbol.insertar(5,"5");
		arbol.insertar(2, "2");
		arbol.insertar(7,"7");
		arbol.insertar(9,"9");
		arbol.insertar(1, "1");
		arbol.insertar(32,"32");
		arbol.insertar(0,"0");
		arbol.recorrer(arbol.raiz);
	}

}
