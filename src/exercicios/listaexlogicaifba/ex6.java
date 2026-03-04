package exercicios.listaexlogicaifba;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        double quociente, restoDivisao;

        System.out.print("DIGITE OS DOIS NÚMEROS: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        quociente = (double) num1 / (double) num2;
        restoDivisao = num1 % num2;

        System.out.println("QUOCIENTE: " + quociente);
        System.out.print("RESTO DIVISÃO: " + restoDivisao);

        scan.close();
    }
}
