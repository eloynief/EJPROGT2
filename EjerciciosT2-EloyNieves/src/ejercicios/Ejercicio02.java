package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable para guardar letras
		int num,letra;
						
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el número: ");
				
		//Comando para introducir el primer número
		num = sc.nextInt();
				
		letra=num%23;
				
		if (num>=10000000 || num<100000000)
		System.out.print("La opción introducida es errónea");
				
		else {
			switch(letra) {
				
			//
			case 0: 
				System.out.print("T");
			break;
			case 1:
				System.out.print("R");
			break;
			case 2:
				System.out.print("W");
			break;
			case 3:
				System.out.print("A");
			break;
			case 4:
				System.out.print("G");
			break;
			case 5:
				System.out.print("M");
			break;
			case 6:
				System.out.print("Y");
			break;
			case 7:
				System.out.print("F");
			break;
			case 8:
				System.out.print("P");
			break;
			case 9:
				System.out.print("D");
			break;
			case 10:
				System.out.print("X");
			break;
			case 11:
				System.out.print("B");
			break;
			case 12:
				System.out.print("N");
			break;
			case 13:
				System.out.print("J");
			break;
			case 14:
				System.out.print("Z");
			break;
			case 15:
				System.out.print("S");
			break;
			case 16:
				System.out.print("Q");
			break;
			case 17:
				System.out.print("V");
			break;
			case 18:
				System.out.print("H");
			break;
			case 19:
				System.out.print("L");
			break;
			case 20:
				System.out.print("C");
			break;
			case 21:
				System.out.print("K");
			break;
			case 22:
				System.out.print("E");
			break;
					
			}
		}
		//cierre de scanner
				sc.close();
	}

}
