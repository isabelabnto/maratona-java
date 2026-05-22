package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes Benz", 275);
        Carro c3 = new Carro("Audi", 290);

//        c1.setVelocidadeLimite(180);


        /* Fica claro que está sendo afetado algo da classe num geral e não somente de um objeto individual */
        /* Pertence a classe */
        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
