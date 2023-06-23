public class Tablet extends Dispositivo {
	private String resolucionPantalla;
	private ArrayList<String> accesorios;

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