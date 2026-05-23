package exercicios.time.dominio;

//import exercicios.time.dominio.Jogador;
/*
* Arrays, Objetos e Sobrecarga
* */

public class Time {
    private String nomeTime;
    private Jogador[] jogadores; /* Array Objeto Jogador - Associação */

    /* Blocos de inicialização */
    /*{
        jogadores = new Jogador[5];
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new Jogador("Jogador " + (i + 1), 20);
        }
    }*/

    /* Construtor vazio */
    public Time() {
    }

    /* Construtor */
    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    /* Construtor */
    public Time(String nomeTime, Jogador[] jogadores) {
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
    }

    /* Get and Setters*/
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    /* Método de impressão */
    public void imprimeTime(){
        System.out.println("Nome time: " + this.nomeTime);

        /* Para garantir segurança caso não existir jogadores cadastrados */
        if (this.jogadores == null){
            System.out.println("Nenhum jogador cadastrado nesse time.");
            return;
        }

        for (int i = 0; i < this.jogadores.length; i++) {
            System.out.println("Jogador: " + this.jogadores[i].getNome());
            System.out.println("Idade: " + this.jogadores[i].getIdade());
        }
    }
}
