package exercicios.listaexlogicaifba;

// Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um
//valor de temperatura em Fahrenheit e exibi-lo em Celsius

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("DIGITE A TEMPERATURA FAHRENHEIT: ");
        fahrenheit = scan.nextDouble();

        celsius = 5.0 / 9.0 * (fahrenheit - 32);

        System.out.println("TEMPERATURA CONVERTIDA PARA CELSIUS: " + celsius);

        scan.close();
    }
}
