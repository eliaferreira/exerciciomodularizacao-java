/*4. Implemente uma função que receba como parâmetro 
 * uma string e retorne o número de
 * vogais contidas na mesma.*/

package modularizacao;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercicio 4 : VOGAIS NA FRASE");

        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine();

        int quantidadeVogais = contarVogais(texto);

        System.out.println("Número de vogais na string: " + quantidadeVogais);

        scanner.close();
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase(); 

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }
}

