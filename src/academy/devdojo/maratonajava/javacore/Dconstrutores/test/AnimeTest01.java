package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
//        Anime anime = new Anime(); <-- sem construtor
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação", "Production 16");
//        Anime anime2 = new Anime();
        /*anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/

        /*anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");*/

        anime.imprime();
//        anime2.imprime();
    }
}