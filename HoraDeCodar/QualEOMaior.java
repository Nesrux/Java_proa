package Exercicios;

import java.util.Scanner;

public class QualEOMaior {
public static void main(String[] args) {
	Scanner entrada =  new Scanner (System.in);
	System.out.println("digite o primeiro número");
	int n1 = entrada.nextInt();
	System.out.println("digite o segundo numero");
	int n2 = entrada.nextInt();
	System.out.println("digite o terceiro numero");
	int n3 = entrada.nextInt();
	
	
	if(n1 > n2 && n1 > n3) {
		System.out.println("o maior número é: "+ n1);
	}else if(n2 > n1 && n2 > n3) {
		System.out.println("o maior número é: "+ n2);
	}else if(n3 > n1 && n3 > n2) {
		System.out.println("o maior número é: "+n3);
	}else {
		System.out.println("digite apenas números");
	}
	
	
	entrada.close();
}
}
