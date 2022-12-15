import java.util.Scanner;

public class PositivoNegativoZero {
public static void main(String[] args) {
/*1 - Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.*/
	 Scanner scan = new Scanner(System.in);    
	    
     int valor;

     System.out.println("Informe um valor: ");
     valor = scan.nextInt();

      if (valor < 0) {
        System.out.println("O valor " + valor + " é negativo.");
      }
      else if (valor > 0) {
        System.out.println("O valor " + valor + " é positivo");
      }
      else if (valor == 0) {
          System.out.println("O valor " + valor + " é zero");
        }
      else {
    	  System.out.println("digite apenas números");
      }
}
}
