/*1. Crie uma função que receba como parâmetro um número inteiro 
 * e retorne verdadeiro se ele for par,
 *  e falso caso contrário. */

package modularizacao;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercicio 1 : PAR OU IMPAR");

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean resultado = ehPar(numero);
        System.out.println("Retorno da função: " + resultado); 

        if (resultado) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

        scanner.close(); 
    }

    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }
}


