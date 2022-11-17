package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable para guardar un número entero
		int num,abs;
						
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//Comando para introducir el número que se pide
		num = sc.nextInt();
		//‘num’ se vuelve positivo si es menor que 0
		abs = num>=0 ? num : -num;
		System.out.print(abs);
	}

}
