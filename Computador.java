package org.example;

public class Computador extends Dispositivo {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	public Pantalla pantalla;

	public Computador(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String añoFabricacion, String precio, String stock, String idDispositivo, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, stock, idDispositivo);
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getTipo() {
		return "Computador";
	}
}