package Exercicios;

import java.util.Scanner;

public class QualEOMaior {
public static void main(String[] args) {
	Scanner entrada =  new Scanner (System.in);
	System.out.println("digite o primeiro n�mero");
	int n1 = entrada.nextInt();
	System.out.println("digite o segundo numero");
	int n2 = entrada.nextInt();
	System.out.println("digite o terceiro numero");
	int n3 = entrada.nextInt();
	
	
	if(n1 > n2 && n1 > n3) {
		System.out.println("o maior n�mero �: "+ n1);
	}else if(n2 > n1 && n2 > n3) {
		System.out.println("o maior n�mero �: "+ n2);
	}else if(n3 > n1 && n3 > n2) {
		System.out.println("o maior n�mero �: "+n3);
	}else {
		System.out.println("digite apenas n�meros");
	}
	
	
	entrada.close();
}
}
