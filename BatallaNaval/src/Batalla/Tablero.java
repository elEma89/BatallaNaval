package Batalla;

import java.util.*;



public class Tablero {
	
String [][] tab ;
	
	public Tablero(String [][] tab) {
		
		this.tab=tab;
		
				
	}
	//imprime el tablero en pantalla, se puede agregar que tablero mostrar
	public  void muestra_tabla() {
		
		for (int i=0;i<tab.length;i++) {
			for (int j=0;j<tab.length;j++) {
				System.out.print("["+tab[i][j]+"]");
			}
			System.out.println();
		}
		
		
	}
	
	//modifica la cordenada ingresada por el usuario
	public void modifica_tabla(int a, int b) {
		
		if (this.tab[a][b].equals("~")) {
			
			this.tab[a][b]="N";
			
		}else{
			System.out.println("puebe en otra coordenada");
		}
		
		muestra_tabla();
		
	}
	
	//asigna un numero segun la letra de la cordenada
	public int numero_letra(String letra) {
		int cord1=0;
		
		switch (letra) {
		case "a":
			cord1 = 1;
			letra="";
			break;
		case "b":
			cord1 = 2;
			letra="";
			break;
		case "c":
			cord1 = 3;
			letra="";
			break;
		case "d":
			cord1 = 4;
			letra="";
			break;
		case "e":
			cord1 = 5;
			letra="";
			break;
		}//fin switch
		
		return cord1;
	}
	
	public void limpiar_pantalla() {
		for(int i=0;i<80;i++) {
			System.out.println();
		}
	}
		
		//arreglo1 para el tablero de ataques, dos
		//arreglo2 para el tablero de barcos, dos
		//variables lanchas igual a 5 en un comienzo, lanchas usuario 1 y lanchas usuario 2	
			//función poner lanchas, poner lanchas 2
		//crear funcion para realizar ataques, compara con llamada a ubicación de lancha
			//crear funcion para el resultado
		//define hundido o agua, contador hundido, si hundido igual a 5 gana
			//funcion para mostrar el tablero
			//funcion o contador que definira cuantas lanchas quedan por usuario
			

	
	
	}

