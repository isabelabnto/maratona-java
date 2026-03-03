package exercicios.listaexlogicaifba;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado1, lado2, lado3, perimetroTriangulo;

        System.out.print("DIGITE AQUI OS TRÊS LADOS: ");
        lado1 = scan.nextDouble();
        lado2 = scan.nextDouble();
        lado3 = scan.nextDouble();

        perimetroTriangulo = lado1 + lado2 + lado3;
        System.out.println("PERIMETRO DO TRIAÂNGULO: " + perimetroTriangulo);
        scan.close();
    }
}
