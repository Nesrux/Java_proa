import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaiorDetres {
public static void main(String[] args) {
	/*Fa�a um programa para ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever o maior deles.*/
	 Scanner entrada = new Scanner(System.in);    
     ArrayList<Integer> numbers = new ArrayList<Integer>();
     int valor;

      for(int i = 0; i < 3; i++) {
         System.out.println("Informe um valor: ");
         valor = entrada.nextInt();

         numbers.add(valor);
      }   
     
      int maior = Collections.max(numbers);
      
      System.out.println("O maior numero informado �: " + maior);

}
}
