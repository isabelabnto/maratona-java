package exercicios.time.dominio;
/*
* Arrays, Objetos e Sobrecarga
 * */

public class Jogador {
    private String nome;
    private int idade;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("-------");
        System.out.println("Jogador " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("-------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
