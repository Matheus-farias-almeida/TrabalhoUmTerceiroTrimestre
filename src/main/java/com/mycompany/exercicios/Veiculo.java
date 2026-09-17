package com.mycompany.exercicios;

public class Veiculo {

    public String marca;
    public String modelo;
    public int anoFabricacao;
    public double quilometragem;

    public Veiculo(String marca, String modelo,
            int anoFabricacao, double quilometragem) {

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public int calcularTempoDeUso() {

        int anoAtual = 2026;

        return anoAtual - this.anoFabricacao;
    }

    public String registrarViagem(double distancia) {

        if (distancia > 0) {

            this.quilometragem =
                    this.quilometragem + distancia;

            return "Viagem registrada!";
        }

        return "A distancia deve ser positiva.";
    }

    public String classificarVeiculo() {

        int tempo = this.calcularTempoDeUso();

        if (tempo <= 3) {
            return "Novo";
        } else if (tempo <= 10) {
            return "Usado";
        } else {
            return "Muito usado";
        }
    }

    public String exibirDados() {

        return "Marca: " + this.marca
                + "\nModelo: " + this.modelo
                + "\nAno: " + this.anoFabricacao
                + "\nQuilometragem: "
                + this.quilometragem + " km"
                + "\nTempo de uso: "
                + this.calcularTempoDeUso() + " anos"
                + "\nClassificacao: "
                + this.classificarVeiculo();
    }
}