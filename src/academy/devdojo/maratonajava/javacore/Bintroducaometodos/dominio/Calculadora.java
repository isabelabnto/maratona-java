package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    // vazio
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
        System.out.println("Finalizando Execução");
    }

    // vazio
    public void subtracaoDoisNumeros(){
        System.out.println(10 - 10);
        System.out.println("Finalizando Execução");
    }

    // vazio
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    // retorna um valor
    public double divideDoisNumeros(double num1, double num2){
        return  num1 / num2;
    }
}
