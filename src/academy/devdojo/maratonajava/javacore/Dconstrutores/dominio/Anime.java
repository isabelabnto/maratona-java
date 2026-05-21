package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

/* Sobrecarga de metódos: */
/* Ter o metódo com o mesmo nome, porém o tipo ou a quantidade de */
/* parâmetros são diferentes */

/* Metódo com o mesmo nome */
/* Quantidade e tipo dos parâmetros precisa ser diferente*/


/* Construtores:
 * - Construtores são necessários para dar origem a um objeto
 * - O Java cria construtores para classes que não forem criadas construtores
 * - Construtores não tem retorno.
 * - Construtores define regras na criação de um objeto
 * - Sempre inicializado primeiro do que os metódos
 * */

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero; /* Novo atributo*/

    /* Construtor */
    public Anime(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(){
        /* Sobrecarga de construtor*/
    }

    /* Metódo fazendo inicialização de todos os atributos */
    /*public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }*/
    /* Pra caso surja um novo atributo após a assinatura ja ter sido definida */
    /* Isso para não afetar o primeiro init*/
    /*public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }*/

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }
    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }
}
