import java.util.Scanner;

public class PositivoNegativoZero {
public static void main(String[] args) {
/*1 - Fa�a um programa que leia um valor informado pelo usu�rio e diga se o valor informado � positivo, negativo ou zero.*/
	 Scanner scan = new Scanner(System.in);    
	    
     int valor;

     System.out.println("Informe um valor: ");
     valor = scan.nextInt();

      if (valor < 0) {
        System.out.println("O valor " + valor + " � negativo.");
      }
      else if (valor > 0) {
        System.out.println("O valor " + valor + " � positivo");
      }
      else if (valor == 0) {
          System.out.println("O valor " + valor + " � zero");
        }
      else {
    	  System.out.println("digite apenas n�meros");
      }
}
}
