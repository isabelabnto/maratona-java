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

    // retorna um valor do tipo double
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }


    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do metodo: ");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);

    }
}
