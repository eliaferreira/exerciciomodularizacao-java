/*3. Crie uma função que receba como parâmetro 
 * um vetor de números inteiros e retorne o valor
 * máximo contido no vetor.*/

package modularizacao;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercicio 3 : VETOR");

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição [" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }

        int maximo = encontrarMaximo(numeros);

        System.out.println("O valor máximo no vetor é: " + maximo);

        scanner.close();
    }

    public static int encontrarMaximo(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
}

