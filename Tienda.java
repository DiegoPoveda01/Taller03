import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private String catalogo;
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();

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

	public void buscarCliente() {
		throw new UnsupportedOperationException();
	}

	public String agregarCliente() {
		throw new UnsupportedOperationException();
	}

	public String buscarDispositivo() {
		throw new UnsupportedOperationException();
	}

	public List<Dispositivo> buscarDispositivoPorMarca() {
		throw new UnsupportedOperationException();
	}

	public List<Dispositivo> buscarDispositivosPorModeloYTipo() {
		throw new UnsupportedOperationException();
	}
}