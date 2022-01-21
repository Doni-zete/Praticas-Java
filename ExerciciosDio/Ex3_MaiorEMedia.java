import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int armazena = 0;
    int maior = 0;
    
    int media=0;
    do {
      System.out.println("Numero:");
      numero = scan.nextInt();
     
      media=(media+numero)/5;
      if (numero > maior) maior = numero;
      armazena = armazena + 1;
       

      System.out.println("O Maior numero e " + maior);
      
    } while (armazena < 5);
    System.out.println("A media é " + media);
  }
}
