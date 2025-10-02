/*9. Crie uma função que receba como parâmetros
 *  dois números inteiros e retorne o máximo
 *  divisor comum entre eles.*/

package modularizacao;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercicio 9: MÁXIMO DIVISOR COMUM ENTRE NÚMEROS INTEIROS");

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int mdc = calcularMDC(a, b);

        System.out.println("O máximo divisor comum entre " + a + " e " + b + " é: " + mdc);

        scanner.close();
    }

    public static int calcularMDC(int a, int b) {
        
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return Math.abs(a); 
    }
}
