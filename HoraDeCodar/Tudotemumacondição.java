package Exercicios;

import java.util.Scanner;

public class Tudotemumacondi��o {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero");
		int n1 = entrada.nextInt();
		
		if(n1 >= 0) {
			System.out.println("seu numero � positivo");
		}
		if(n1 < 0) {
			System.out.println("seu numero � negativo");
		}
		if(n1 == 0) {
			System.out.println("Seu numero � zero");
		}
		
		entrada.close();
	}

}
