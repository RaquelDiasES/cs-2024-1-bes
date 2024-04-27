package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetorinteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int indice = 0;

        try {
            while (true) {
                System.out.print("Digite um número inteiro (ou 0 para sair): ");
                int numero = scanner.nextInt();
                if (numero == 0) {
                    vetor[indice] = numero;
                    break;
                }
                vetor[indice] = numero;
                indice++;
                if (indice >= 10) {
                    throw new ArrayIndexOutOfBoundsException("Você excedeu o tamanho máximo do vetor.");
                }
            }

            System.out.println("\nValores digitados:");
            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor digitado não é numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você excedeu o tamanho máximo do vetor.");
        }
    }
}
