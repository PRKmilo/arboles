package co.edu.unbosque.model;

public class Estructura {
	public static Nodo raiz;
	
	public Estructura() {
		raiz=null;
	}
	
	



	public void insertar(int i,Object numero) {
		Nodo n=new Nodo(i);
		System.out.println("este es el indice "+i);
		n.contenido = numero;
		if(raiz == null) {
			System.out.println("se tiene la raiz como null");
			raiz = n;
		}else {
			Nodo aux = raiz;
			System.out.println("se esta pasando por el else");
			System.out.println("esta es la raiz "+raiz.llave);
			while(aux != null) {
				n.padre=aux;
				if(n.llave >= aux.llave) {
					System.out.println("esta es el aux "+aux.llave);
					aux=aux.derecha;
				}else {
					System.out.println("esta es el aux "+aux.llave);
					aux=aux.izquierda;
				}
			}
			if(n.llave < n.padre.llave) {
				System.out.println("esta es la llave "+n.llave);
				n.padre.izquierda = n;
			}else {
				n.padre.derecha=n;
			}
		}
	}
	
	public void recorrer(Nodo n) {
		if(n != null) {
			recorrer(n.izquierda);
			System.out.println("indise "+n.llave+" numero "+n.contenido);
			recorrer(n.derecha);
			if(n.padre != null) {
				System.out.println("este es el padre de el nodo n."+n.llave+" el cual su padre es "+n.padre.llave);
			}
		}
	}
	
	public Nodo encontrarnodo(int value,Nodo raiz) {
		Nodo aux=raiz;
		while(aux.llave != value) {
			if(value < aux.llave) {
				aux=aux.izquierda;
			}else {
				aux=aux.derecha;
			}if(aux==null) {
				return null;
			}
		}
		return aux;
	}
	
	public Nodo ancestro(Nodo raiz,Nodo x,Nodo y) {
		if(raiz == null) {
			return null;
		}
		if(raiz == x || raiz == y) {
			return raiz;
		}
		Nodo left = ancestro(raiz.izquierda,x,y);
		
		Nodo right = ancestro(raiz.derecha,x,y);
		
		if (left != null && right != null) {
			return raiz;
		}
		
		if (left != null) {
			return left;
		}
		
		if (right != null) {
			return right;
		}
		
		return null;
	}

}
