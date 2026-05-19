package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    /*public String nome;
    public int idade;
    public  double[] salario;
    public double media = 0;*/
    /*public double[] salario = new double[3];*/

//  Colocar os atributos como privados para proteger
    private String nome;
    private int idade;
    private  double[] salario;
    private double media = 0;

    /*public void imprimirDados(){
        System.out.println("========");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        for(int i = 0; i < salario.length; i++){
            System.out.println("SALARIO °" + (i + 1) + ": " + salario[i]);
        }
        System.out.println("========");
    }*/

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double salario : salario) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario();
    }


    public void imprimeMediaSalario(){
        for(double num: salario) {
            media += num;
        }
        media /= salario.length;
        System.out.println("MEDIA SALARIAL: " + media);
    }

    /* SETTERS */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    /* Atributo media é do tipo que não se deve ter set */
    /*public void setMedia(double media) {
        this.media = media;
    }*/
    /* GETTERS */
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
