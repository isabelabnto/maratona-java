package exercicios.listaexlogicaifba;

// Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ladoQuadrado, perimetroQuadrado, areaQuadrado;

        System.out.println("DIGITE O VALOR DO LADO DO QUADRADO: ");
        ladoQuadrado = input.nextDouble();

        areaQuadrado = Math.pow(ladoQuadrado, 2);
        perimetroQuadrado = 4 * ladoQuadrado;
        System.out.println("AREA DO QUADRADO: " + areaQuadrado);
        System.out.println("AREA DO PERIMETRO: " + perimetroQuadrado);

        input.close();
    }
}
