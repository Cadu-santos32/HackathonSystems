package main.java.hackathon.modelo;

public class Projeto {
    private String nome;
    private Equipe equipe;
    private int notaFinal;

    public Projeto(String nome, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + " | Equipe: " + equipe.getNome() + " | Nota Final: " + notaFinal;
    }
}
