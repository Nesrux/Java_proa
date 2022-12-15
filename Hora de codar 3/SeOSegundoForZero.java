import java.util.Scanner;

public class SeOSegundoForZero {
public static void main(String[] args) {
	/*Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.*/
	Scanner scan = new Scanner(System.in);    
    int n1;
    int n2;
    double res;

  System.out.println("Digite o primeiro valor: ");
  n1 = scan.nextInt();

  System.out.println("Digite o segundo valor: ");
  n2 = scan.nextInt();

  while(n2 == 0 || n2 < 0) {
    System.out.println("O valor nao pode ser 0! ");
     
    System.out.println("Digite o primeiro valor: ");
    n1 = scan.nextInt();

    System.out.println("Digite o segundo valor: ");
    n2 = scan.nextInt();
  }

   res = (n1 / n2);

   System.out.println("A divisão do numero1 pelo numero 2 é: " + res);
	
}
}
