package main.java.hackathon;

import main.java.hackathon.modelo.Empresa;
import main.java.hackathon.modelo.Estudante;
import main.java.hackathon.modelo.Instituicao;
import main.java.hackathon.modelo.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instituicao i1 = new Empresa("PucMinas");
        Estudante p1 = new Estudante("Carlos", 19, i1);
        System.out.println("Estudante 1: " + p1.getNome() + "\nidade: " + p1.getIdade() + "\nInstiruicao: " + i1);
    }
}