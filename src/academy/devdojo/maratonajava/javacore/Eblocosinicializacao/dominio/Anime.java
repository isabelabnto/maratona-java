package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

/* Blocos de inicialização
* Em qualquer lugar da classe, mas normalmente no começo antes dos construtores de depois dos atributos
* Executado todas as vezes que cria um objeto
*
* Quando está criando um objeto:
* 1 - Alocado espaço em memória para o objeto
* 2 - Cada atributo de classe é criado e incializado com valores default ou o que for passado
* 3 - Bloco de inicialização é executado
* 4 - Construtor é executado
* */

public class Anime {
    private String nome;
    private int[] episodios;

    /* Bloco de incialização
    * Executado antes do construtor
    * */
    {
        System.out.println("Dentro do bloco");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
