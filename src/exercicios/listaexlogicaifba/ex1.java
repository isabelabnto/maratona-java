package exercicios.listaexlogicaifba;

// Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
// perímetro.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseRetangulo, alturaRetangulo, areaRetangulo, perimetroRetangulo;

        System.out.println("DIGITE A BASE DO RETÂNGULO: ");
        baseRetangulo = input.nextDouble();
        System.out.println("DIGITE A ALTURA DO RETANGULO: ");
        alturaRetangulo = input.nextDouble();

        areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("AREA DO RETANGULO: " + areaRetangulo);

        perimetroRetangulo = 2 * (baseRetangulo * alturaRetangulo);
        System.out.println("PERIMETRO DO RETANGULO: " + perimetroRetangulo);

        input.close();
    }
}
