package exercicios.listaexlogicaifba;

// Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e dias.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idadePessoaEmDias, idadePessoaAnos, idadePessoaMeses;

        idadePessoaEmDias = scan.nextInt();

        // idade anos
        idadePessoaAnos = idadePessoaEmDias / 365;
        int idadeMult365 = idadePessoaAnos * 365;
        int restoDias = idadePessoaEmDias - idadeMult365;

        // meses
        idadePessoaMeses = restoDias / 30;
        int idadeMult30 = idadePessoaMeses * 30;

        // resto dias
        int restoDiasMeses = restoDias - idadeMult30;

        System.out.println("IDADE EXATA: ");
        System.out.printf("%d dias = %d anos, %d meses e %d dias", idadePessoaEmDias, idadePessoaAnos, idadePessoaMeses, restoDiasMeses);

        scan.close();
    }
}
