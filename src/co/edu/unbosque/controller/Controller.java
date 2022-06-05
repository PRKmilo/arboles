package co.edu.unbosque.controller;

import co.edu.unbosque.model.Estructura;
import co.edu.unbosque.model.Nodo;
import co.edu.unbosque.vista.view;
/*jorge yate 
 * juan camilo piza 
 * esteban hernandez 
 * javier villarreal*/
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
			
	      int p1=v.leerDatoEntero("Digite el nodo");
	      String tq= "" + p1;
			         
			      arbol.insertar(p1, tq);
				break;  
			case 2:
			   	try {
				 int n1= v.leerDatoEntero("Digite el primero que quiere encontrar distancia");
		            int n2= v.leerDatoEntero("Digite el segundo que quiere encontrar distancia");
		          
		           v.mostrarInformacion("Distancia entre = "+arbol.EncontrarDis(arbol.raiz, arbol.encontrarnodo(n1, arbol.raiz), arbol.encontrarnodo(n2, arbol.raiz)));
			   	}
			   	catch (Exception e){
	            	v.mostrarInformacion("este es la distancia   "+1);
	            	
	            }
		           
			   	finally {
            		break;
            	      
            	}
      
				
            case 3:
            	try {
            		int t =v.leerDatoEntero("Digite el primer nodo para el anecestro");
                	int t1 =v.leerDatoEntero("Digite el segundo nodo para el anecestro");
                	
    				arbol.recorrer(arbol.raiz);
    			v.mostrarInformacion(arbol.ancestro(arbol.raiz, arbol.encontrarnodo(t, arbol.raiz), arbol.encontrarnodo(t1, arbol.raiz)).llave+" este es el ancestro");
              
            		
            	}
            catch (Exception e){
            	v.mostrarInformacion("este es el ancestro  "+1);
            	
            }
            	finally {
            		break;
            	      
            	}
      
      
            
        
			case 0:
				
				break;
			default:
			
				break;
			}
		}
     	}
		v.mostrarInformacion("Has acabado");
	}

	
	

}
