package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadoraTest03 = new Calculadora();
        double result = calculadoraTest03.divideDoisNumeros(20, 2);
        System.out.println(result);
    }
}
