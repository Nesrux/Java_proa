import java.util.Scanner;

public class AMediaDosDez {
	public static void main(String[] args) {
/*Fa�a um programa que leia 10 valores informados pelo usu�rio, calcule, exiba os n�meros informados e escreva a m�dia aritm�tica desses valores lidos.*/
		   Scanner scan = new Scanner(System.in); 
	       
	       int total = 0;
	       
	       for (int i = 0; i < 10; i++) {

	           System.out.println("Digite um valor: ");
	           int n1 = scan.nextInt();
	           total += n1;
	       }

	       System.out.println("A m�dia artim�tica desses 10 valores foi de: " + (total / 10));
	}

}
