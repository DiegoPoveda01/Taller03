package org.example;

public class Notebook extends Dispositivo {
	private String resolucionPantalla;
	private String tipoTeclado;
	private String bateria;

	public Notebook(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String añoFabricacion, String precio, String stock, String resolucionPantalla, String tipoTeclado, String bateria) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.resolucionPantalla = resolucionPantalla;
		this.tipoTeclado = tipoTeclado;
		this.bateria = bateria;
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public String getBateria() {
		return this.bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public String getTipo() {
		return "Notebook";
	}
}