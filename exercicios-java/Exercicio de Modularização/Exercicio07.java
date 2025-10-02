/*7. Crie uma função que receba como parâmetro 
 * uma string contendo um nome completo
 * (composto por nome e sobrenome) e retorne o primeiro nome.*/

package modularizacao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Exercicio 7: PRIMEIRO NOME NA STRING");
		
		String nomeCompleto;

		System.out.print("Informe seu nome completo: ");
		nomeCompleto = scanner.nextLine();

		System.out.println("Primeiro nome: " + obterPrimeiroNome(nomeCompleto));

		scanner.close();
	}

	public static String obterPrimeiroNome(String nomeCompleto) {
		
		String[] partes = nomeCompleto.trim().split(" ");
		return partes[0];
	}
}