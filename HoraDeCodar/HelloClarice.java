package Exercicios;

import java.util.Scanner;

public class HelloClarice {
public static void main(String[] args) {
	//Escreva um programa em Java em que o usu�rio informe o seu nome e exiba a mensagem "Ol�, [NomeDoUsuario]".
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe seu nome");
	String nome  = entrada.nextLine();
	
	System.out.printf("Ol�, %s", nome);
	
	entrada.close();
}
}
