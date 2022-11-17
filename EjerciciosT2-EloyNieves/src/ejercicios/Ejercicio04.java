package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable para guardar letras
		int num,dec,uni;
						
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el número: ");
				
		//Comando para introducir el primer número
		num = sc.nextInt();
		//dar valor a las variables creadas
		uni=num%10;
		dec=num/10;
		//comando switch el cual tiene ciertos casos que si se cumplen, da una cosa o otra
			switch(uni) {
				
			//
			case 1:
				System.out.print("uno");
			break;
			case 2:
				System.out.print("dos");
			break;
			case 3:
				System.out.print("tres");
			break;
			case 4:
				System.out.print("cuatro");
			break;
			case 5:
				System.out.print("cinco");
			break;
			case 6:
				System.out.print("seis");
			break;
			case 7:
				System.out.print("siete");
			break;
			case 8:
				System.out.print("ocho");
			break;
			case 9:
				System.out.print("nueve");
			break;
			}
			
			switch(num) {
			//
			case 10:
				System.out.print("diez");
			break;
			case 11:
				System.out.print("once");
			break;
			case 12:
				System.out.print("doce");
			break;
			case 13:
				System.out.print("trece");
			break;
			case 14:
				System.out.print("catorce");
			break;
			case 15:
				System.out.print("quince");
			break;
			case 20:
				System.out.print("veinte");
			break;
			}
			
			switch(dec%10) {
			case 1->
			
				System.out.print("dieci");
			break;
			
			}
		//cierre de scanner
				sc.close();
	}

}
