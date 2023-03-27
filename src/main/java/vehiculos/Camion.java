package vehiculos;

public class Camion extends Vehiculo {
	
	int ejes;
	public static int CantidadCamion;
	
	public Camion(String placa,   String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 4, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.CantidadCamion+=1;
	
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getCantidadCamion() {
		return CantidadCamion;
	}

	public static void setCantidadCamion(int cantidadCamion) {
		CantidadCamion = cantidadCamion;
	}
	
	
}
