package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "John";
        funcionario.idade = 19;
        funcionario.salario = new double[]{200, 400, 100};

        /*for (int i = 0; i < funcionario.salario.length; i++){
            funcionario.salario[i] = scanner.nextDouble();
        }*/

        funcionario.imprimirDados();
        funcionario.imprimeMediaSalario(funcionario.salario);

        scanner.close();
    }
}
