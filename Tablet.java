package org.example;

import java.util.ArrayList;

public class Tablet extends Dispositivo {
	private String resolucionPantalla;
	private ArrayList<String> accesorios;

	public Tablet(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String añoFabricacion, String precio, String stock, String resolucionPantalla) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public ArrayList<String> getAccesorios() {
		throw new UnsupportedOperationException();
	}

	public void setAccesorios(ArrayList<String> accesorios) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}