
package javaapplication7;
 import java.util.Scanner;

public class JavaApplication7 {
 int valor;
 static Scanner leia = new Scanner (System.in);
  
public static void main(String[] args) {
 System.out.println("Digiti um numero inteiro: ");
  int valor = leia.nextInt();
  
if (valor % 2 == 0 ) {
    System.out.println("O número é PAR");
}else{ 
    System.out.println("O número é IMPAR");
    
}       
}
}
