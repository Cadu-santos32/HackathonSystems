package main.java.hackathon.modelo;

public class Profissional extends Pessoa{

    private String senioridade;

    public Profissional(String nome, Instituicao instituicao, String senioridade) {
        this.senioridade = senioridade;
        super(nome, instituicao);
    }
}
