package Exercicios;

import java.util.Scanner;

public class Qualoque {
	public static void main(String[] args) {
			  System.out.println("Informe um valor");
		        Scanner entrada = new Scanner(System.in);
		        int numero_1 = entrada.nextInt();
		 
		        System.out.println("Informe um 2° valor");
		        int numero_2 = entrada.nextInt();
		 
		        System.out.println("Informe um 3° valor");
		        int numero_3 = entrada.nextInt();
		 
		        if(numero_1 > numero_2 && numero_1 > numero_3 && numero_2 < numero_3){
		            System.out.println("A soma dos 2 maiores numeros é " + (numero_1 + numero_3));
		        }
		        else if(numero_2 > numero_1 && numero_2 > numero_3 && numero_1 < numero_3){
		            System.out.println("A soma dos 2 maiores numeros é " + (numero_2  + numero_3));
		        }
		        else if(numero_3 > numero_1 && numero_3 > numero_2 && numero_1 < numero_2){
		            System.out.println("A soma dos 2 maiores numeros é " + (numero_3 + numero_2));
		        }
		        else if(numero_3 > numero_2 && numero_3 > numero_1){
		            System.out.println("A soma dos 2 maiores numeros é " + (numero_3 + numero_1));
		        }
		        else if(numero_2 > numero_3 && numero_2 > numero_1 ){
		            System.out.println("A soma dos 2 maiores numeros é " + (numero_2 + numero_1));
		        }
		        else if(numero_1 > numero_3 && numero_1 > numero_2){
		            System.out.println("A soma dos 2 maiores numeros é " + (numero_1 + numero_2));
		        }
		 
		        entrada.close();

	}

}
