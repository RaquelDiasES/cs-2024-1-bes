package atividade08;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta bancária: ");
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();

        try {
            conta.sacar(valorSaque);
            System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso. Saldo atual: R$ " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao realizar saque: " + e.getMessage());
        }

        scanner.close();
    }
}