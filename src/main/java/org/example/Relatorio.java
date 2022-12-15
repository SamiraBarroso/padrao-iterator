package org.example;

public class Relatorio {
    public static Integer contarLivrosRomance(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getGenero().equals("Romance")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarLivrosFantasia(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getGenero().equals("Fantasia")) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarLivrosTerror(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.getGenero().equals("Terror")) {
                quantidade++;
            }
        }
        return quantidade;
    }

}
