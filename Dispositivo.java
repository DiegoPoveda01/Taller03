package org.example;

public abstract class Dispositivo {
	protected String marca;
	protected String memoriaRam;
	protected String memoriaAlmacenamiento;
	protected String procesador;
	protected String modelo;
	protected String añoFabricacion;
	protected String precio;
	protected String stock;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMemoriaRam() {
		return this.memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	public void setMemoriaAlmacenamiento(String memoriaAlmacenamiento) {
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getStock() {
		return this.stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public abstract String getTipo();
}