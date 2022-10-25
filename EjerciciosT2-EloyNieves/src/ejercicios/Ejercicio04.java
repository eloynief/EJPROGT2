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
		
				
		if (num>=10 || num<1)
		System.out.print("La opción introducida es errónea");
				
		else {
			switch(num) {
				
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

					
			}
		}
		//cierre de scanner
				sc.close();
	}

}
