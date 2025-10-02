/*8. Implemente uma função que receba como 
 * parâmetro um vetor de números inteiros e um
 * número inteiro N e retorne um novo vetor 
 * contendo apenas os valores maiores do que N.*/

package modularizacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercicio 8: VALORES MAIOR QUE N NO VETOR");

        System.out.print("Informe o tamanho do vetor: ");
        int[] vetor = new int[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição [" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        int[] maioresQueN = filtrarMaioresQueN(vetor, n);

        System.out.print("Valores maiores que " + n + ": ");
        for (int valor : maioresQueN) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }

    public static int[] filtrarMaioresQueN(int[] vetor, int n) {
        ArrayList<Integer> maiores = new ArrayList<>();

        for (int valor : vetor) {
            if (valor > n) {
                maiores.add(valor);
            }
        }

        return maiores.stream().mapToInt(Integer::intValue).toArray();
    }
}
