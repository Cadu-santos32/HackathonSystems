package main.java.hackathon.modelo;

public class Universidade extends Instituicao {
    public Universidade(String nome){
        super(nome);
    }
    public String toString(){
        return super.getNome();
    }
}