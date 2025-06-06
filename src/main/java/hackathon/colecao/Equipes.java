package main.java.hackathon.colecao;

import main.java.hackathon.modelo.Equipe;

import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instance;
    private List<Equipe> listaEquipes;

    private Equipes(){
        listaEquipes = new ArrayList<>();
    }

    public static Equipes getInstance(){
        if(instance == null){
            instance = new Equipes();
        }
        return instance;
    }

    public void adicionarEquipe(Equipe equipe){
        listaEquipes.add(equipe);
    }

    public List<Equipe> getTodas() {
        return listaEquipes;
    }
    public Equipe buscarPorNome(String nome){
        return listaEquipes.stream()
                .filter(e -> e.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}