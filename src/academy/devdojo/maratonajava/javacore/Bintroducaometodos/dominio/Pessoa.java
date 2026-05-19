package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

// Modificadores de acesso private, get e set
public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    /* Metodo de acesso atributos privados da classe */
    /* Convenção Java: usar "set" para setar (atribuir ou modificar o valor de uma variável */
    public void setNome(String nome){
        /* Atributo nome recebe parametro nome vindo de fora da classe */
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    /* Metodo de acesso atributos privados */
    /* Convenção Java: usar "get" para obter valores dos atributos privados */
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
