package com.mycompany.exercicios;

public class Pessoa {
   
    public String nome;
    public Integer idade;
    public Double altura;

   
    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade= idade;
    }

    public String fazerAniversario() {
        return "Parabens! " + this.nome + " fez aniversario e agora tem " + this.idade + " anos!";
    }
   
   
   public String exibirDados(){
       return "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nAltura: " + this.altura;
   }
}    
