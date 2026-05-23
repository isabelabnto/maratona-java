package exercicios.contabancaria.test;

import exercicios.contabancaria.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("000-111-222", "Maria");
        System.out.println("Nome Titular: " + conta1.getTitular());
        System.out.println("Número conta: " + conta1.getNumeroDaConta());
        System.out.println("Saldo atual: " + conta1.getSaldo());
        System.out.println("-----");
        System.out.println("Depositando dinheiro...");
        conta1.depositar(700);
        System.out.println("Saldo atual: " + conta1.getSaldo());
        System.out.println("Sacando dinheiro...");
        conta1.sacar(800);
        System.out.println("Saldo atual: " + conta1.getSaldo());
        System.out.println("Sacando dinheiro...");
        conta1.sacar(400);
        System.out.println("Saldo atual: " + conta1.getSaldo());

        System.out.println(" ");

        ContaBancaria conta2 = new ContaBancaria("111-333-444", "Luiz");
        System.out.println("Nome Titular: " + conta2.getTitular());
        System.out.println("Número conta: " + conta2.getNumeroDaConta());
        System.out.println("Saldo atual: " + conta2.getSaldo());
        System.out.println("Depositando dinheiro...");
        conta2.depositar(5000);
        System.out.println("Saldo atual: " + conta2.getSaldo());
        System.out.println("Sacando dinheiro...");
        conta2.sacar(800);
        System.out.println("Saldo atual: " + conta2.getSaldo());
        System.out.println("Sacando dinheiro...");
        conta2.sacar(400);
        System.out.println("Saldo atual: " + conta2.getSaldo());

    }
}
