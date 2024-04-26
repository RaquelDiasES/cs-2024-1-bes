package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        try {
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            double resultado = dividirNumeros(num1, num2);
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor digitado não é numérico.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }
    }

    public static double dividirNumeros(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return num1 / num2;
    }

}