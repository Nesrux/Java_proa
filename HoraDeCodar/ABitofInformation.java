package Exercicios;

import java.util.Scanner;

public class ABitofInformation {
	public static void main(String[] args) {
		//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
		//Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
		
		Scanner entrada  =  new Scanner(System.in);
		System.out.println("Digte o seu nome:");
		String nome = entrada.nextLine();
		
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.printf("Olá, %s, sua idade é %d", nome, idade);
		
		
		
		entrada.close();
}
}
