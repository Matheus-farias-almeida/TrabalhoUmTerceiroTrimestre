package com.mycompany.exercicios;

public class CarteiraDigital {

    public String titular;
    public double saldo;
    public int numeroTransacoes;

    public CarteiraDigital(String titular, double saldo) {

        this.titular = titular;
        this.saldo = saldo;
        this.numeroTransacoes = 0;
    }

    public String receber(double valor) {

        if (valor > 0) {

            this.saldo = this.saldo + valor;
            this.numeroTransacoes =
                    this.numeroTransacoes + 1;

            return "Valor recebido com sucesso!";
        }

        return "O valor deve ser positivo.";
    }

    public String pagar(double valor) {

        if (valor > 0 && valor <= this.saldo) {

            this.saldo = this.saldo - valor;
            this.numeroTransacoes =
                    this.numeroTransacoes + 1;

            return "Pagamento realizado com sucesso!";
        }

        return "Pagamento nao realizado.";
    }

    public double consultarSaldo() {

        return this.saldo;
    }

    public String exibirExtrato() {

        return "Titular: " + this.titular
                + "\nSaldo: R$ " + this.saldo
                + "\nNumero de transacoes: "
                + this.numeroTransacoes;
    }
}