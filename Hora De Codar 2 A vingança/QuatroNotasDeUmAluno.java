import java.util.Scanner;

public class QuatroNotasDeUmAluno {
	public static void main(String[] args) {
		/*Escreva um programa para ler as notas das 4 avalia��es de um aluno no semestre, calcular e escrever a m�dia do semestre e a seguinte mensagem: PARAB�NS! Voc� foi aprovado! somente se o aluno foi aprovado (considere 6.0 a m�dia m�nima para aprova��o e 4 notas informadas).*/
		
	    Scanner scan = new Scanner(System.in); 
	    int n1, n2, n3, n4;
	    int res;
	    String name;

	    System.out.println("Digite seu nome: ");
	    name = scan.nextLine();

	    System.out.println("Informe a primeira nota do aluno: ");
	    n1 = scan.nextInt();
	    Math.round(n1);

	    System.out.println("Informe a segunda nota do aluno: ");
	    n2 = scan.nextInt();
	    

	    System.out.println("Informe a terceira nota do aluno: ");
	    n3 = scan.nextInt();
	    

	    System.out.println("Informe a quarta nota do aluno: ");
	    n4 = scan.nextInt();
	    
	    res = (n1 + n2 + n3 + n4) / 4;
	    
	    if (res >= 6 && res <= 10) {
	        System.out.println("Parabens aluno: " + name + " voc� foi aprovado com a m�dia: " + res);
	    }
	    else if (res < 6 && res >= 0) {
	        System.out.println("Infelizmente aluno: " + name + " n�o foi aprovado sua m�dia foi: " + res);
	    }
	    else {
	        System.out.println("Por favor somente valores de 1 a 10!");
	    }

	     
	    }
	}

