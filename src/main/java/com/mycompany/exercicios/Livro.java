package com.mycompany.exercicios;

public class Livro {

    public String titulo;
    public String autor;
    public int numeroPaginas;
    public double preco;

    public Livro(String titulo, String autor,
            int numeroPaginas, double preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    public String exibirDetalhes() {

        return "Titulo: " + this.titulo
                + "\nAutor: " + this.autor
                + "\nPaginas: " + this.numeroPaginas
                + "\nPreco: R$ " + this.preco;
    }

    public String aplicarDesconto(double percentual) {

        if (percentual >= 0 && percentual <= 50) {

            double desconto = this.preco * percentual / 100;

            this.preco = this.preco - desconto;

            return "Desconto aplicado!";
        }

        return "Desconto invalido!";
    }
}