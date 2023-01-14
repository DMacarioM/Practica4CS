package com.Proyecto.calidad.Proyecto;

public class Coche {

	private String nombre;
	private int nruedas;
	private int peso;
	private int plazas;
	
	public Coche(String nombre, int nruedas, int peso, int plazas) {
		this.nombre=nombre;
		this.nruedas=nruedas;
		this.peso=peso;
		this.plazas=plazas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Boolean estudioPeso() {
		//Devuelve true si pesa más de 1000
		if(this.peso<1000) {
			return false;
		}else {
			return true;
		}
	}
}

