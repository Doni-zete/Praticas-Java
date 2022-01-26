/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex7_OrdemInversa {

  public static void main(String[] args) {

    int[] vetor = { 5, -16, 60, 80, 2, 9 };

    System.out.print("\nVetor: ");
    int contador = 0;
    while (contador < (vetor.length)) {

      System.out.print(vetor[contador] + " ");
      contador++;
    }

    System.out.print("\nVetor: ");
    for (int i = (vetor.length - 1); i >= 0; i--) {
      System.out.print(vetor[i] + " ");
    }

  }
}
