package exercicios.listaexlogicaifba;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, sucessorNumero;

        numero = scan.nextInt();
        sucessorNumero = numero + 1;

        System.out.printf("SUCESSOR DE %d: %d",  numero, sucessorNumero);
        scan.close();
    }
}
