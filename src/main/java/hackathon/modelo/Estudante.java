package main.java.hackathon.modelo;

public class Estudante extends Pessoa{
    private int idade;

    public Estudante(String nome, int idade, Instituicao instituicao) {
        super(nome, instituicao);
        this.idade = idade;
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getNome() {
        return super.getNome();
    }
    public int getIdade() {
        return idade;
    }
}
