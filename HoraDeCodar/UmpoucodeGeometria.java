package Exercicios;

import java.util.Scanner;

public class UmpoucodeGeometria {
public static void main(String[] args) {
	/*Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas �reas.
	 *  O usu�rio ir� informar os valores de cada vari�vel.
	 *   Crie um arquivo para cada f�rmula e poste os  arquivos no GitHub. Link do reposit�rio abaixo. */
	
	Scanner entrada = new Scanner(System.in);
		System.out.println("Digite Qual programa Voc� quer ver,\n 1)Retangulo \n 2)quadrado \n 3)Losangulo \n 4)trapezio \n 5)triangulo \n 6)circulo \n 7)paralelogramo");
		int id = entrada.nextInt();

		
		switch(id) {
		case 1: case 7:
			System.out.println("digite a base");
			int base = entrada.nextInt();
			
			System.out.println("digite a altura");
			int altura = entrada.nextInt();
			
			int somaQuadrado = base * altura;
			System.out.printf("A Area do quadrado � %d ", somaQuadrado);
			break;
		case 2:
			System.out.println("Digite um lado do Quadrado ");
			int LadoQ = entrada.nextInt();
			int areaQ = LadoQ * LadoQ;
			System.out.printf("a area do quadrado � %d", areaQ);
			break;
		case 3:
			System.out.println("digite a diagonal maior");
			double dMaior = entrada.nextDouble();
			
			
			System.out.println("digite a diagonal menor");
			double dMenor = entrada.nextDouble();
			
			
			double areaLosangulo = (dMaior * dMenor) /2;
			
			System.out.printf("A area do losangulo � %.3f", areaLosangulo);
			break;
		case 4:
			System.out.println("digite a base maior");
			double bMaior = entrada.nextDouble();
			
			System.out.println("digite a base menor");
			double bMenor = entrada.nextDouble();
			
			System.out.println("digite a altura");
			double hTrapezio = entrada.nextDouble();
			
			double areaTrapezio = ((bMaior + bMenor) * hTrapezio) /2 ;
			System.out.printf("a area do tra�zio � %.2f", areaTrapezio);
			break;
		case 5:
			System.out.println("digite a base do triangulo");
			double bTriangulo =  entrada.nextDouble();
			
			System.out.println("digite a altura do triangulo");
			double aTriangulo = entrada.nextDouble();
			
			double areaTriangulo = aTriangulo * bTriangulo / 2;
			
			System.out.printf("a Area do triangulo � : %.2f", areaTriangulo);
		case 6:
			System.out.println("digite o raio do circulo");
			double rCirculo = entrada.nextDouble();
			double pi = Math.PI;
			double areaCirculo = pi * Math.pow(rCirculo, 2);
			System.out.printf("a area do circulo � %.2f", areaCirculo);
		}
	
	
	
	
	
	entrada.close();
}
}
