package examenud14;

import java.util.ArrayList;

public class Zoo {
	//CREO ARRAYLIST
	private ArrayList<Habitat> habitats;
	private ArrayList<Animal> mamiferos;
	private ArrayList<Animal> aves;
	private ArrayList<Animal> reptiles;
	//CREO OBJETOS HABITAT Y ANIMAL
	Habitat aviario = new Habitat("Aviario");
	Habitat reptilarios = new Habitat("Reptilarios");
	Habitat safari = new Habitat ("Safari");
	Animal mamifero1 = new Animal("Chispas", 'F', "Nutria", 4, Desplazamiento.TIERRA);
	Animal mamifero2 = new Animal("Yogui", 'M', "Oso", 6, Desplazamiento.TIERRA);
	Animal mamifero3 = new Animal("Michael", 'M', "Cabra", 9, Desplazamiento.TIERRA);
	Animal mamifero4 = new Animal("Flipper", 'M', "Delfin", 4, Desplazamiento.MAR);
	Animal ave1 = new Animal("Jertru", 'F', "Avestruz", 5, 1.3, false);
	Animal ave2 = new Animal("Skipper", 'M', "Pinguino", 7, 0.4, false);
	Animal ave3 = new Animal("Rafael", 'M', "Aguila", 2, 0.3, true);
	Animal ave4 = new Animal("Gilberta", 'F', "Golondrina", 1, 0.1, false);
	Animal reptil1 = new Animal("Rafa", 'M', "Lagarto", 7, "Verde");
	Animal reptil2 = new Animal("Juanan", 'M', "Piton", 3, "Amarilla");
	Animal reptil3 = new Animal("Punchis", 'M', "Rana", 2, "Verde");
	Animal reptil4 = new Animal("Jennifer", 'F', "Culebra", 6, "Negra");
	//CONSTRUCTOR DEL ZOO AGREGANDO
	public Zoo() {
		this.habitats = new ArrayList<Habitat>();
		this.aves = new ArrayList<Animal>();
		this.mamiferos = new ArrayList<Animal>();
		this.reptiles = new ArrayList<Animal>();
		aves.add(ave1);
		aves.add(ave2);
		aves.add(ave3);
		aves.add(ave4);
		reptiles.add(reptil1);
		reptiles.add(reptil2);
		reptiles.add(reptil3);
		reptiles.add(reptil4);
		mamiferos.add(mamifero1);
		mamiferos.add(mamifero2);
		mamiferos.add(mamifero3);
		mamiferos.add(mamifero4);
		aviario.agregarAnimal(ave1);
		aviario.agregarAnimal(ave2);
		aviario.agregarAnimal(ave3);
		aviario.agregarAnimal(ave4);
		reptilarios.agregarAnimal(reptil1);
		reptilarios.agregarAnimal(reptil2);
		reptilarios.agregarAnimal(reptil3);
		reptilarios.agregarAnimal(reptil4);
		safari.agregarAnimal(mamifero1);
		safari.agregarAnimal(mamifero2);
		safari.agregarAnimal(mamifero3);
		safari.agregarAnimal(mamifero4);
		habitats.add(reptilarios);
		habitats.add(aviario);
		habitats.add(safari);
	}
	// GETTER, AGREGAR ANIMAL A LA LISTA DE MAMIFEROS, ELIMINA ANIMAL DE LA LISTA DE MAMIFEROS
	public void getMamiferos() {
		System.out.println("MAMIFEROS EN EL ZOO:");
		for(int i =0; i<mamiferos.size();i++) {
			System.out.println((i+1)+"-"+mamiferos.get(i).getNombre());
		}
	}
	public void agregarMamifero (Animal animal) {
		mamiferos.add(animal);
	}
	public void eliminarMamifero(int posicion) {
		mamiferos.remove(posicion);
	}
	//LO MISMO CON AVES
	public void getAves() {
		System.out.println("AVES EN EL ZOO:");
		for(int i =0; i<aves.size();i++) {
			System.out.println((i+1)+"-"+aves.get(i).getNombre());
		}
	}
	public void agregarAve (Animal animal) {
		aves.add(animal);
	}
	public void eliminarAve(int posicion) {
		aves.remove(posicion);
	}
	//LO MISMO CON REPTILES
	public void getReptiles() {
		System.out.println("REPTILES EN EL ZOO:");
		for(int i =0; i<reptiles.size();i++) {
			System.out.println((i+1)+"-"+reptiles.get(i).getNombre());
		}
	}
	public void agregarReptil (Animal animal) {
		reptiles.add(animal);
	}
	public void eliminarReptil(int posicion) {
		reptiles.remove(posicion);
	}
	//LO MISMO CON HABITATS
	public void agregarHabitat(Habitat habitat) {
		habitats.add(habitat);
	}
	public void eliminarHabitat(int posicion) {
		habitats.remove(posicion);
	}
	public void getHabitats() {
		System.out.println("HABITATS EN EL ZOO:");
		for(int i =0; i<habitats.size();i++) {
			System.out.println((i+1)+"-"+habitats.get(i).getNombre());
		}
	}
	public void agregarMamiferosHabitat(int posicionMamifero, int posicionHabitat) {
		Animal a = mamiferos.get(posicionMamifero);
		Habitat b = habitats.get(posicionHabitat);
		b.agregarAnimal(a);
	}
	public void agregarAvesHabitat(int posicionMamifero, int posicionHabitat) {
		Animal a = aves.get(posicionMamifero);
		Habitat b = habitats.get(posicionHabitat);
		b.agregarAnimal(a);
	}
	public void agregarReptilesHabitat(int posicionMamifero, int posicionHabitat) {
		Animal a = reptiles.get(posicionMamifero);
		Habitat b = habitats.get(posicionHabitat);
		b.agregarAnimal(a);
	}
	@Override
	public String toString() {
		return "Zoo [habitats=" + habitats + "]";
	}
	
	
	
}
