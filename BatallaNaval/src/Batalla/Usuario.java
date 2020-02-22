package Batalla;

import java.util.*;


public class Usuario {

	public static void main(String[] args) {
		
		int cord1 = 0;
		int cord2 = 0;
		String n_jug;
		String letra;
		String[][] tab = { { " ", "1", "2", "3", "4", "5" }, 
							{ "A", "~", "~", "~", "~", "~" },
							{ "B", "~", "~", "~", "~", "~" }, 
							{ "C", "~", "~", "~", "~", "~" }, 
							{ "D", "~", "~", "~", "~", "~" },
							{ "E", "~", "~", "~", "~", "~" }, };

		System.out.println("*** BATALLA NAVAL ***");
		System.out.println();
		Scanner leo = new Scanner(System.in);
		Tablero tab1 = new Tablero(tab);

		System.out.println();
		System.out.println("*****************************");
		System.out.println("Ingrese su nombre de Jugador:");
		n_jug = leo.nextLine();
		// System.out.println();
		System.out.println("*****************************");
		System.out.println("Ingrese coordenadas para ingresa su nave");
		System.out.println("por letra y numero de la tabla");

		tab1.muestra_tabla();
		System.out.println("*****************************");
		
		//controla el ingreso de 5 naves
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Ingrese letra de coordenada "+(i+1));
			cord1=tab1.numero_letra(leo.next());
			
			System.out.println("Ingrese numero de coordenada "+(i+1));
			cord2 = leo.nextInt();

			System.out.println();
			
			tab1.modifica_tabla(cord1, cord2);

		}//fin for

		//Crear la matriz {{~,~,~,~,~,~,~},
		//					{~,~,~,~,~,~,~}...
		
		//Mostrar la matriz y solicitar el ingreso de las 5 lanchas
		
		//Guardar lanchas en matriz de jugador 1 o 2
		
		//Se repite para el otro jugador
		
		//Inicio de juego
		
		
	}

}
