package refactoring;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int numeros=IntNum();
		suma(numeros);
		multiplicacion(numeros);

	}

	public static void suma(int numeros) {

		int suma = 0;
		for (int i = numeros; i > 0; i--) {
			if (i % 2 == 0) {
				suma += i;
			}
		}

		System.out.println("La suma de los numeros pares son " + suma);
		suma = 0;
		for (int i = numeros; i > 0; i--) {
			if (i % 2 != 0) {
				suma += i;
			}
		}
		System.out.println("La suma de los numeros impares son " + suma);

	}
	
	public static void multiplicacion(int numeros) {

		int multiplicacion = 1;
		for (int i = numeros; i > 0; i--) {
			if (i % 2 == 0) {
				multiplicacion *= i;
			}
		}

		System.out.println("La multipliacion de los numeros pares son " + multiplicacion);
		multiplicacion = 1;
		for (int i = numeros; i > 0; i--) {
			if (i % 2 != 0) {
				multiplicacion *= i;
			}
		}
		System.out.println("La multipliacion de los numeros impares son " + multiplicacion);

	}
	

	public static int IntNum() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		int numeros = sc.nextInt();
		
		sc.close();
		return numeros;
	}
}