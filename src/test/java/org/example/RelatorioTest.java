package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void retornaLivrosRomance() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Anna Karenina", "Leon Tolstoi", "Romance"),
                new Livro("Cem Anos de Solidão", "Gabriel García Márquez", "Romance"),
                new Livro("Crime e Castigo", "Fiódor Dostoiévski", "Romance"),
                new Livro("A Sociedade do Anel", "J.R.R. Tolkien", "Fantasia"),
                new Livro("O Iluminado", "Stephen King", "Terror")

        );
        assertEquals(3, Relatorio.contarLivrosRomance(biblioteca));
    }

    @Test
    void retornaLivrosFantasia() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Jane Eyre", "Charlotte Brontë", "Romance"),
                new Livro("Mrs. Dalloway", "Virginia Woolf", "Romance"),
                new Livro(" A Guerra dos Tronos", "George R. R. Martin", "Fantasia"),
                new Livro("A Sociedade do Anel", "J.R.R. Tolkien", "Fantasia"),
                new Livro("As Brumas de Avalon", "Marion Zimmer Bradley", "Fantasia"),
                new Livro("O Chamado do Cthulhu", "H.P. Lovecraft", "Terror")
        );
        assertEquals(3, Relatorio.contarLivrosFantasia(biblioteca));
    }

    @Test
    void retornaLivrosTerror() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Persuasão", "Jane Austen", "Romance"),
                new Livro("O Retorno do Rei", "J.R.R. Tolkien", "Fantasia"),
                new Livro("O O Chamado do Cthulhu", "H.P. Lovecraft", "Terror"),
                new Livro("A Outra Volta do Parafuso", "Henry James", "Terror"),
                new Livro("O Corvo", "Edgar Allan Poe", "Terror"),
                new Livro("Medo Clássico", "Edgar Allan Poe", "Terror")
        );
        assertEquals(4, Relatorio.contarLivrosTerror(biblioteca));
    }

}