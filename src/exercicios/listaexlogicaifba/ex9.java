package exercicios.listaexlogicaifba;

// Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
//seu raio e sua altura.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio, altura, valorVolumeLataOleo;

        System.out.println("DIGITE O RAIO E A ALTURA DA LATA DE ÓLEO: ");
        raio = scan.nextDouble();
        altura = scan.nextDouble();

        valorVolumeLataOleo = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("VALOR VOLUME LATA DE ÓLEO: " + valorVolumeLataOleo);
        scan.close();
    }
}
