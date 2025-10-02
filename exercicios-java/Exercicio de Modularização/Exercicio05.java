/*5. Crie uma função que receba como parâmetro 
 * um vetor de números inteiros e retorne um novo vetor 
 * contendo apenas os valores pares do vetor original.*/

package modularizacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercicio 5: VALOR PAR DO VETOR");

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetorOriginal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor da posição [" + i + "]: ");
            vetorOriginal[i] = scanner.nextInt();
        }

        int[] vetorPares = filtrarPares(vetorOriginal);

        System.out.print("Vetor com valores pares: ");
        for (int num : vetorPares) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] filtrarPares(int[] vetor) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int num : vetor) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        
        int[] resultado = new int[pares.size()];
        for (int i = 0; i < pares.size(); i++) {
            resultado[i] = pares.get(i);
        }

        return resultado;
    }
}

