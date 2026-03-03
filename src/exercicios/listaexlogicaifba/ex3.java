package exercicios.listaexlogicaifba;

// Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raioCircunferencia, area, perimetro;

        System.out.print("DIGITE O TAMANHO DO RAIO DA CIRCUNFERENCIA: ");
        raioCircunferencia = input.nextDouble();

        area = (Math.PI * Math.pow(raioCircunferencia, 2));
        perimetro = (2 * Math.PI * raioCircunferencia);

        System.out.println("PERIMETRO DA CIRCUNFERENCIA: " + perimetro);
        System.out.print("AREA DA CIRCUNFERENCIA: " + area);

        input.close();
    }
}
