package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public  double[] salario;
    /*public double[] salario = new double[3];*/

    public void imprimirDados(){
        System.out.println("========");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        for(int i = 0; i < salario.length; i++){
            System.out.println("SALARIO °" + (i + 1) + ": " + salario[i]);
        }
        System.out.println("========");
    }

    public void imprimeMediaSalario(double[] salario){
        double media = 0;
        for(double num: salario) {
            media += num;
        }
        media /= salario.length;
        System.out.println("MEDIA SALARIAL: " + media);
    }
}
