package exercicios.contabancaria.dominio;

/*
* Sistema simples de conta bancária para treinar proteção de dados encapsulamento
* Classes, métodos, encapsulamento, acesso
* * */

public class ContaBancaria {
    private String numeroDaConta;
    private String titular;
    private double saldo = 0.0; /* saldo sempre inciar em zero */

    /* Construtor*/
    public ContaBancaria(String numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /* Método depositar */
    public void depositar(double valorDeposito){
        if (valorDeposito > 0){
            saldo += valorDeposito;
            System.out.println("Valor Depositado com Sucesso!");
        }
        else {
            System.out.println("Não é possível depositar esse valor!");/* Impedir que deposite saldo negativo */
        }
        System.out.println("-------");
    }

    public void sacar(double valorSaque){
        if(valorSaque > 0){
            saldo -= valorSaque;
            System.out.println("--------");
            System.out.println("Saque Autorizado.");
        }
        else{
            System.out.println("--------");
            System.out.println("Saldo Insuficiente!");
        }
    }
}
