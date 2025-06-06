package main.java.hackathon.colecao;

import main.java.hackathon.modelo.Apresentacao;
import main.java.hackathon.modelo.Jurado;
import main.java.hackathon.modelo.Projeto;

import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> listaapresentacoes;

    private Apresentacoes(){
        listaapresentacoes = new ArrayList<Apresentacao>();
    }
    public static Apresentacoes getInstance(){
        if(instance == null){
            instance = new Apresentacoes();
        } return instance;
    }
    public void adicionaApresentacao(Apresentacao apresentacao){
        listaapresentacoes.add(apresentacao);
    }
    public List<Apresentacao> getTodas(){
        return listaapresentacoes;
    }
}
