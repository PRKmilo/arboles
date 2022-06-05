package co.edu.unbosque.controller;

import co.edu.unbosque.model.Estructura;
import co.edu.unbosque.model.Nodo;
import co.edu.unbosque.vista.view;

public class Controller {
	private Estructura arbol;
	private Nodo nodo;
	private view v;
	public Controller() {
		v=new view();
		arbol=new Estructura();
		funcionar();
	}
	public void funcionar() {
		int p=v.leerDatoEntero("Cuantas pruebas quiere");
		int n=v.leerDatoEntero("cuantas comandos quiere hacer");
         for (int j=0;j<p;j++) {
		for (int i=0 ;i <n; i++) {
			int numeroMenu = v.leerDatoMenu();
			v.setSelect(numeroMenu);
			
			switch(v.getSelect()) {
			case 1:
			
	      
			         
			      
				break;  
			case 2:
	
			    
				break;
				
            case 3:
			
  
       
                  
				break;
      
            
        
			case 0:
				
				break;
			default:
			
				break;
			}
		}
     	}
		v.mostrarInformacion("Has acabado");
	}
	public void funcionar1() {
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
		System.out.println(arbol.encontrarnodo(9,arbol.raiz).llave+" este es el valor de el nodo");
		System.out.println("Distancia entre = "+arbol.EncontrarDis(arbol.raiz, arbol.encontrarnodo(4, arbol.raiz), arbol.encontrarnodo(76, arbol.raiz)));
		System.out.println(arbol.ancestro(arbol.raiz, arbol.encontrarnodo(5, arbol.raiz), arbol.encontrarnodo(3, arbol.raiz)).llave+" este es el ancestro");
	}
	
	

}
