package Exercicios;

import java.util.Scanner;

public class ABitofInformation {
	public static void main(String[] args) {
		//Escreva um programa em Java em que o usu�rio informe o seu nome e em seguida o programa perguntar� a idade do usu�rio.
		//Agora o programa deve exibir a mensagem "Ol�, [NomeDoUsuario], sua idade � [idade]".
		
		Scanner entrada  =  new Scanner(System.in);
		System.out.println("Digte o seu nome:");
		String nome = entrada.nextLine();
		
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.printf("Ol�, %s, sua idade � %d", nome, idade);
		
		
		
		entrada.close();
}
}
