import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantiNumeros = 0;
    int numero;
    int par = 0, impar = 0;

    System.out.println("Quantidade de numero");
    quantiNumeros = scan.nextInt();

    int contador = 0;
    do {
      System.out.println("Numero");
      numero = scan.nextInt();

      if (numero % 2 == 0)
        par++;
      else
        impar++;

      contador = contador + 1;

    } while (contador < quantiNumeros);
    
    System.out.println("Quantidade de numeros pares " + par);
    System.out.println("Quantidade de numeros  impares " + impar);

  }
}
