import java.util.Scanner;

public class Kabum {
public static void main(String[] args) {
	/*Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Utilize "document.write" para escrever em tela e no final da repetição escreva "EXPLOSÃO".*/
	 Scanner scan = new Scanner(System.in);    
	    
     
     for (int i = 30; i >= 1; i--) {
         
        System.out.println(i);
       
     }
     System.out.println("Kabumm!!!");
      
  } 
}

