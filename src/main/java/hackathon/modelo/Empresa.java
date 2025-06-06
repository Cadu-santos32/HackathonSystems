package main.java.hackathon.modelo;

public class Empresa extends Instituicao{
    public Empresa(String nome){
        super(nome);
    }
    @Override
    public String toString() {
        return super.getNome();
    }
}