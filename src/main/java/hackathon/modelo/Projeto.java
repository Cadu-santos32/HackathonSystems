package hackathon.modelo;

public class Projeto {
    private String nome;
    private Equipe equipe;

    public Projeto(String nome, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;
    }
    public String getNome() {
        return nome;
    }
    public String getEquipe() {
        return equipe;
    }
}