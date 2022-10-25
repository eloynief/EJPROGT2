package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int comida,animales,kilos;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el valor de la comida: ");
		
		//Comando para introducir el primer número el cual representa la comida
		comida = sc.nextInt();
		//Comando para introducir el segundo número el cual representa los animales
		animales = sc.nextInt();
		/*Comando para introducir el tercer número el cual representa los kilos.
		Los kilos */
		kilos = sc.nextInt();
		//cierre de scanner
		sc.close();
	}

}
