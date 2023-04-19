package examenud14;

public class Animal {
	private String nombre;
	private char genero;
	private String especie;
	private int edad;
	private Desplazamiento desplazamiento;
	private double longitudPico;
	private boolean rapaz;
	private String color;
	
	public Animal(String nombre, char genero, String especie, int edad, Desplazamiento desplazamiento) { //CONSTRUCTOR PARA MAMIFEROS
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.desplazamiento = desplazamiento;
	}
	public Animal(String nombre, char genero, String especie, int edad, double longitudPico, boolean rapaz) { //CONSTRUCTOR PARA AVES
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.longitudPico = longitudPico;
		this.rapaz = rapaz;
	}
	public Animal(String nombre, char genero, String especie, int edad, String color) { //CONSTRUCTOR PARA REPTILES
		this.nombre = nombre;
		this.genero = genero;
		this.especie = especie;
		this.edad = edad;
		this.color = color;
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", genero=" + genero + ", especie=" + especie + ", edad=" + edad
				+ ", desplazamiento=" + desplazamiento + ", longitudPico=" + longitudPico + ", rapaz=" + rapaz
				+ ", color=" + color + "]";
	}
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public char getGenero() {
		return genero;
	}
	public String getEspecie() {
		return especie;
	}
	public int getEdad() {
		return edad;
	}
	public Desplazamiento getDesplazamiento() {
		return desplazamiento;
	}
	public double getLongitudPico() {
		return longitudPico;
	}
	public boolean isRapaz() {
		return rapaz;
	}
	public String getColor() {
		return color;
	}
	
	
}
