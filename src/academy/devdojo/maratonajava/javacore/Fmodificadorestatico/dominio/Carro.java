package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

/*
* Modificadores Estáticos
* - Vem depois do modificador de acesso e antes do tipo seguindo as convenções
* - Ao definir algo estático, aquilo passa a ser da classe e não do objeto individual em si
* - Todos os objetos vão compartilhar do mesmo valor
*
* Métodos estáticos
* - Não é possivel acessar variaveis não estáticas dentro de metodos estaticos
* - Boas Práticas: Criar metodo estático quando o metodo não acessa uma variavel/atributo da isntância
* */

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    /* Atributo estático */
    /* Pertence a classe*/
    private static double velocidadeLimite = 250; /* Atributo que pertence a classe. Estático */

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);

//        System.out.println("Velocidade limite " + this.velocidadeLimite); /* this se refere ao objeto*/

        /*Forma correta de trabalhar um atributo estático */
        System.out.println("Velocidade limite " + Carro.velocidadeLimite); /* Dessa forma se refere ao atributo da classe*/
    }

    /* Set metódo estatico */
    public static void setVelocidadeLimite(double velocidadeLimite) { /* velocidadeLimite é um atributo estático*/
        /* this.velocidadeLimite = velocidadeLimite*/
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
