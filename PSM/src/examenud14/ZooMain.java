package examenud14;

import java.util.Scanner;

public class ZooMain {
	static Scanner sc = new Scanner(System.in);
	static int opcion;
	public static void main(String[] args) {
		Zoo MiZoo = new Zoo();
		menu();
		
		while(!(opcion ==8)) { //WHILE PARA REPETIR EL MENU SIEMPRE QUE LA OPCION NO SEA 8
			while(opcion<1||opcion>8) { //SI LA OPCION NO ES CORRECTA TE LA PIDE DE NUEVO
				System.out.println("Opcion no valida, escribe una correcta: ");
				opcion = sc.nextInt();
			}
			switch(opcion) {
			case 1:
				System.out.println("1.Agregar 2.Eliminar"); //CASO 1: AGREGA O ELIMINA ANIMALES
				int opcion1 = sc.nextInt();
				if(opcion1==1) {
					System.out.println("Que animal quieres agregar?(Mamifero, Ave o Reptil)");
					sc.nextLine();
					String opcionAgregar1 = sc.nextLine().toLowerCase();
					if(opcionAgregar1.equals("mamifero")) {
						System.out.println("Nombre: ");
						String nombreMamifero = sc.nextLine();
						System.out.println("Genero: ");
						String generoMamiferov1 = sc.nextLine();
						char generoMamiferov2 = generoMamiferov1.charAt(0);
						System.out.println("Especie: ");
						String especieMamifero = sc.nextLine();
						System.out.println("Edad: ");
						int edadMamifero = sc.nextInt();
						System.out.println("Desplazamiento: 1.Mar 2.Tierra 3.Aire");
						int desplazamiento = sc.nextInt();
						if(desplazamiento ==1) {
							Animal mamifero = new Animal(nombreMamifero, generoMamiferov2, especieMamifero, edadMamifero, Desplazamiento.MAR);
							MiZoo.agregarMamifero(mamifero);
						}
						else if(opcion==2){
							Animal mamifero = new Animal(nombreMamifero, generoMamiferov2, especieMamifero, edadMamifero, Desplazamiento.TIERRA);							MiZoo.agregarMamifero(mamifero);
							MiZoo.agregarMamifero(mamifero); 
						}
						else if(opcion==3) {
							Animal mamifero = new Animal(nombreMamifero, generoMamiferov2, especieMamifero, edadMamifero, Desplazamiento.AIRE);
							MiZoo.agregarMamifero(mamifero);
						}
						else
							System.out.println("Opcion no valida");
						
					}
					else if(opcionAgregar1.equals("ave")) {
						System.out.println("Nombre: ");
						String nombreAve = sc.nextLine();
						System.out.println("Genero: ");
						String generoAvev1 = sc.nextLine();
						char generoAvev2 = generoAvev1.charAt(0);
						System.out.println("Especie: ");
						String especieAve = sc.nextLine();
						System.out.println("Edad: ");
						int edadAve = sc.nextInt();
						System.out.println("Longitud del pico: ");
						double longitudPico = sc.nextDouble();
						System.out.println("Es rapaz?(true or false)");
						boolean rapazAve = sc.nextBoolean();
						Animal ave = new Animal(nombreAve, generoAvev2, especieAve, edadAve, longitudPico, rapazAve);
						MiZoo.agregarAve(ave);
					}
					else if(opcionAgregar1.equals("reptil")) {
						System.out.println("Nombre: ");
						String nombreReptil = sc.nextLine();
						System.out.println("Genero: ");
						String generoReptilv1 = sc.nextLine();
						char generoReptilv2 = generoReptilv1.charAt(0);
						System.out.println("Especie: ");
						String especieReptil = sc.nextLine();
						System.out.println("Edad: ");
						int edadReptil = sc.nextInt();
						System.out.println("Color: ");
						String colorReptil = sc.nextLine();
						Animal reptil = new Animal(nombreReptil, generoReptilv2, especieReptil, edadReptil, colorReptil);
						MiZoo.agregarReptil(reptil);
					}
					else
						System.out.println("Opcion no valida");
				}
				else if(opcion1==2) {
					System.out.println("Que quieres eliminar? (Mamifero, ave o reptil)");
					sc.nextLine();
					String opcionEliminar1 = sc.nextLine().toLowerCase();
					if(opcionEliminar1.equals("mamifero")) {
						MiZoo.getMamiferos();
						System.out.println("Indica el numero del animal que deseas eliminar");
						int eliminarMamifero = sc.nextInt();
						MiZoo.eliminarMamifero(eliminarMamifero-1);
					}
					else if(opcionEliminar1.equals("ave")) {
						MiZoo.getAves();
						System.out.println("Indica el numero del animal que deseas eliminar");
						int eliminarAve = sc.nextInt();
						MiZoo.eliminarAve(eliminarAve-1);
					}
					else if(opcionEliminar1.equals("reptil")) {
						MiZoo.getReptiles();
						System.out.println("Indica el numero del animal que deseas eliminar");
						int eliminarReptil = sc.nextInt();
						MiZoo.eliminarReptil(eliminarReptil-1);
					}
					else
						System.out.println("Opcion no valida");
				}
				else
					System.out.println("Opcion incorrecta");
				MiZoo.getMamiferos();
				MiZoo.getAves();
				MiZoo.getReptiles();
				menu();
			break;
			case 2:
				System.out.println("1.Agregar 2.Eliminar"); //AGREGA O ELIMINA HABITATS
				int opcion2 = sc.nextInt();
				if(opcion2==1) {
					System.out.println("Nombre del habitat: ");
					sc.nextLine();
					String nombreHabitat = sc.nextLine();
					Habitat habitat = new Habitat(nombreHabitat);
					MiZoo.agregarHabitat(habitat);
				}
				else if(opcion2==2) {
					MiZoo.getHabitats();
					System.out.println("Indica el numero del habitat que deseas eliminar");
					int eliminarHabitat = sc.nextInt();
					MiZoo.eliminarHabitat(eliminarHabitat-1);
				}
				else
					System.out.println("Opcion no valida");
				MiZoo.getHabitats();
				menu();
			break;
			case 3:
				System.out.println("caso 3");
				menu();
			break;
			case 4:
				System.out.println("Que animal? (Mamifero, ave o reptil)"); //ASIGNA UN ANIMAL A UN HABITAT
				sc.nextLine();
				String opcionEliminar1 = sc.nextLine().toLowerCase();
				if(opcionEliminar1.equals("mamifero")) {
					MiZoo.getMamiferos();
					System.out.println("Indica el numero del animal que quieres asignar a un habitat");
					int asignarAnimal = sc.nextInt();
					MiZoo.getHabitats();
					System.out.println("Indica el numero del habitat donde quieres asignar el animal");
					int asignarHabitat = sc.nextInt();
					MiZoo.agregarMamiferosHabitat(asignarAnimal-1, asignarHabitat-1);
				}
				else if(opcionEliminar1.equals("ave")) {
					MiZoo.getAves();
					System.out.println("Indica el numero del animal que quieres asignar a un habitat");
					int asignarAnimal2 = sc.nextInt();
					MiZoo.getHabitats();
					System.out.println("Indica el numero del habitat donde quieres asignar el animal");
					int asignarHabitat2 = sc.nextInt();
					MiZoo.agregarAvesHabitat(asignarAnimal2-1, asignarHabitat2-1);
				}
				else if(opcionEliminar1.equals("reptil")) {
					MiZoo.getReptiles();
					System.out.println("Indica el numero del animal que quieres asignar a un habitat");
					int asignarAnimal3 = sc.nextInt();
					MiZoo.getHabitats();
					System.out.println("Indica el numero del habitat donde quieres asignar el animal");
					int asignarHabitat3 = sc.nextInt();
					MiZoo.agregarReptilesHabitat(asignarAnimal3-1, asignarHabitat3-1);
				}
				else
					System.out.println("Opcion no valida");
				menu();
			break;
			case 5:
				System.out.println("caso 5");
				menu();
			break;
			case 6:
				System.out.println("caso 6");
				menu();
			break;
			case 7: //IMPRIME LOS DATOS DE TODOS
				System.out.println(MiZoo.toString());
				menu();
			break;
			}
		}
		
	}
	public static void menu() {
		System.out.println("****MENU****\n1. Agregar y eliminar animales\n2. Agregar y eliminar habitats\n3. Agregar y eliminar cuidadores\n4. Asignar animal a un habitat\n5. Asignar un cuidador a un animal\n6. Mostrar informacion detallada\n7. Mostrar los animales ordenados por edad\n8. Salir");
		System.out.println("Que quieres hacer?");
		opcion = sc.nextInt();
	}
}
