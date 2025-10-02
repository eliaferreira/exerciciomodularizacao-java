/*6. Implemente uma função que receba como 
 * parâmetro uma matriz de números inteiros e retorne 
 * o valor médio de todos os elementos contidos na matriz.*/


package modularizacao;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercicio 6: VALOR MÉDIO NA MATRIZ");

        System.out.print("Informe o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Informe o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        double media = calcularMedia(matriz);

        System.out.println("A média dos elementos da matriz é: " + media);


        scanner.close();
    }

    public static double calcularMedia(int[][] matriz) {
        int soma = 0;
        int totalElementos = 0;

        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
                totalElementos++;
            }
        }

        return totalElementos > 0 ? (double) soma / totalElementos : 0;
    }
}

