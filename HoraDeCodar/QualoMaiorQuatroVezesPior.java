package Exercicios;

import java.util.Scanner;

public class QualoMaiorQuatroVezesPior {
	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro n�mero: ");
		
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int num3 = entrada.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		int num4 = entrada.nextInt();
		
		
		if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num1 || num2 == num3 || num2 == num4 || num3 == num1 
			|| num3 == num2 || num3 == num4) {
			System.out.println("N�o se pode repetir o mesmo numero!!! ");
		} else if (num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("O maior numero � " + num1);
		} else if (num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println("O maior numero � " + num2);
		} else if (num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println("O maior numero � " + num3);
		} else if (num4 > num1 && num4 > num2 && num4 > num3) {
			System.out.println("O maior numero � " + num4);
		}
		
		entrada.close();
	}

}
