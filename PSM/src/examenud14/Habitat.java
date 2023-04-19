package examenud14;

import java.util.ArrayList;

public class Habitat {
	private String nombre;
	private ArrayList<Animal> animales;
	

	public Habitat(String nombre) {
		super();
		this.nombre = nombre;
		this.animales = new ArrayList<Animal>();	
	}
	public void agregarAnimal (Animal animal) { //AGREGA UN ANIMAL AL HABITAT
		this.animales.add(animal);
	}
	public void eliminarAnimal (int posicion) { //ELIMINA UN ANIMAL DEL HABITAT
		this.animales.remove(posicion+1);
	}
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Habitat [nombre=" + nombre + ", animales=" + animales + "]";
	}
	
	
	
}
