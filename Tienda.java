package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private String direccion;
	private String catalogo;
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	public Tienda(String direccion, String catalogo){
		this.direccion = direccion;
		this.catalogo = catalogo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}

	public Cliente buscarCliente(String email) {
		for (Cliente cliente : clientes) {
			if (cliente.getEmail().equals(email)) {
				return cliente;
			}
		}
		return null;
	}


	public void agregarCliente(Cliente cliente) {
		String email = cliente.getEmail();
		Cliente clienteExistente = buscarCliente(email);
		if (clienteExistente == null) {
			clientes.add(cliente);
			System.out.println("Cliente agregado.");
		} else {
			System.out.println("El cliente ya existe, no puede ser agregado nuevamente.");
		}
	}


	public String buscarDispositivo(String idDispositivo) {
		for (Dispositivo dispositivo : dispositivos) {
			if (dispositivo.getIdDispositivo().equals(idDispositivo)) {
				return "La información del dispositivo es: " + dispositivo.getMarca()  +  dispositivo.getMemoriaRam()  +  dispositivo.getMemoriaAlmacenamiento()  +  dispositivo.getProcesador()  +  dispositivo.getProcesador()  +  dispositivo.getModelo()  +  dispositivo.getAñoFabricacion()  +  dispositivo.getPrecio()  +  dispositivo.getStock();
			}
		}
		return "El dispositivo no se encontró.";
	}


	public List<Dispositivo> buscarDispositivoPorMarca(String marca) {
		List<Dispositivo> dispositivosEncontrados = new ArrayList<>();
		for (Dispositivo dispositivo : dispositivos) {
			if (dispositivo.getMarca().equalsIgnoreCase(marca)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}
		return dispositivosEncontrados;
	}


	public List<Dispositivo> buscarDispositivosPorModeloYTipo(String modelo, String tipo) {
		List<Dispositivo> dispositivosEncontrados = new ArrayList<>();
		for (Dispositivo dispositivo : dispositivos) {
			if (dispositivo.getModelo().equalsIgnoreCase(modelo) && dispositivo.getTipo().equalsIgnoreCase(tipo)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}
		return dispositivosEncontrados;
	}
	public void agregarDispositivo(Dispositivo dispositivo) {
		dispositivos.add(dispositivo);
	}
}