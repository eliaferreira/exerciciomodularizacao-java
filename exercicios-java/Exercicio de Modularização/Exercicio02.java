/*2. Implemente uma função que calcule o fatorial 
 * de um número inteiro passado como parâmetro 
 * e retorne o resultado. 
 */

package modularizacao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Exercicio 2 : CALCULO DE FATORIAL");

		System.out.print("Informe um numero inteiro para calcular o fatorial: ");
		numero = entrada.nextInt();

		if (numero < 0) { 
			System.out.println("Não é possível calcular o fatorial de número negativo.");
		} else {
			System.out.println("O fatorial de " + numero + " é: " + calcularFatorial(numero));
		}

		entrada.close();
	}

	public static long calcularFatorial(int numero) {
		long fatorial = 1;
		for (int i = 2; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
