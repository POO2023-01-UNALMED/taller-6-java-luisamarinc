package vehiculo;

public class Camioneta extends Vehiculo  {
	
	boolean volco;
	public static int CantidadCamioneta;
	
	public Camioneta(String placa, int puertas,String nombre, int precio, int peso,
		 Fabricante fabricante, boolean volco) {
		super(placa,puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.CantidadCamioneta+=1;
	
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamioneta() {
		return CantidadCamioneta;
	}

	public static void setCantidadCamioneta(int cantidadCamioneta) {
		CantidadCamioneta = cantidadCamioneta;
	}
	

}
