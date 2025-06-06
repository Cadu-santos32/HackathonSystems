package main.java.hackathon.modelo;
import java.util.List;
import java.util.ArrayList;

public class Equipe {
    private String nome;
    private List<Estudante> alunos;
    private Projeto projeto;

    public Equipe(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    public void adicionarAluno(Estudante aluno) {
        if(alunos.size() < 5){
            alunos.add(aluno);
        }
    }
    public void setProjeto(Projeto projeto){
        this.projeto = projeto;
    }
    public Projeto getProjeto(){
        return projeto;
    }
    public String getNome() {
        return nome;
    }
}