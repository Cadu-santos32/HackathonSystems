package main.java.hackathon.modelo;

import java.util.List;

public class Apresentacao {
    private Projeto projeto;
    private List<Jurado> jurados;

    public Apresentacao(Projeto projeto, List<Jurado> jurados, List<Double> notas) {
        this.projeto = projeto;
        this.jurados = jurados;
        this.notas = notas;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public double getNotaFinal(){
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}
