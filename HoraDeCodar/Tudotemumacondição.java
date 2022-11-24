package Exercicios;

import java.util.Scanner;

public class Tudotemumacondição {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero");
		int n1 = entrada.nextInt();
		
		if(n1 >= 0) {
			System.out.println("seu numero é positivo");
		}
		if(n1 < 0) {
			System.out.println("seu numero é negativo");
		}
		if(n1 == 0) {
			System.out.println("Seu numero é zero");
		}
		
		entrada.close();
	}

}
