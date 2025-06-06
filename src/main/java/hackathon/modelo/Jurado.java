package main.java.hackathon.modelo;

public class Jurado extends Profissional{
    private String nome;

    public Jurado(String nome, String senioridade, Instituicao instituicao) {
        this.nome = nome;
        super(nome, instituicao, senioridade);
    }
    public String getNome() {
        return nome;
    }
}
