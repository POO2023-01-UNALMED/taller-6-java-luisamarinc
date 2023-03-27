package vehiculo;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos+=1;
		if (Pais.Listapaises.contains(fabricante.getPais().getNombre())){
            int indice=Pais.Listapaises.indexOf(fabricante.getPais().getNombre());
            int elemento=Pais.CantidadListapaises.get(indice);
            Pais.CantidadListapaises.set(indice,elemento+1);
        }
        else{
            Pais.Listapaises.add(fabricante.getPais().getNombre());
            Pais.CantidadListapaises.add(1);
        } 

        if (Fabricante.Listafabrica.contains(fabricante.getNombre())){
            int indice1=Fabricante.Listafabrica.indexOf(fabricante.getNombre());
            int elemento1=Fabricante.CantidadListafabrica.get(indice1);
            Fabricante.CantidadListafabrica.set(indice1,elemento1+1);
        }
        else{
            Fabricante.Listafabrica.add(fabricante.getNombre());
            Fabricante.CantidadListafabrica.add(1);
        }
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	

	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	

	public static String vehiculosPorTipo (){
		int Automoviles=Automovil.getCantidadAutomovil();
        int Camionetas=Camioneta.getCantidadCamioneta();
        int Camiones=Camion.getCantidadCamion();

        return "Automoviles: "+Automoviles+"\nCamionetas: "+Camionetas+"\nCamiones: "+Camiones;
		
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}

}
