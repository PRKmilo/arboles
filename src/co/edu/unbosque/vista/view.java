package co.edu.unbosque.vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class view {
	

	private int select;
	
	

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}

	public view () {
	
		select=-1;
	}
	
	public int leerDatoEntero(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	

	
	public String leerDatoString(String mensaje) {
		String dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	
	public int leerDatoMenu() {
		int respuesta =0;
		String mensaje = JOptionPane.showInputDialog("Ingrese lo que desee hacer:"
				+"\n1. Agregar x"
				+"\n2. Distancia X Y"
				+"\n3. Ancestro U V"
				+"\n0. Salir");
		respuesta = Integer.parseInt(mensaje);
		return respuesta;
	}

}
