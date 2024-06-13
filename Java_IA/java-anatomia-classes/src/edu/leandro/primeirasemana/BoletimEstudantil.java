package edu.leandro.primeirasemana;

public class BoletimEstudantil {

    public static void main(String[] args) {

        int mediaFinal = 8;
        if (mediaFinal < 6)
            System.out.println("REPROVAO");
        else if (mediaFinal == 6)
            System.out.println("PROVA DE MINERVA");
        else
            System.out.println("APROVADO");

    }
}
