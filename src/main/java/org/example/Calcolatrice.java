package org.example;

public class Calcolatrice {
    public double somma(double a, double b){
        return a+b;
    }

    public double sottrazione(double a, double b){
        return a-b;
    }

    public double prodotto(double a, double b){
        return a*b;
    }

    public double divisione(double a, double b) throws IllegalArgumentException{
        if (b == 0d) {
            throw new IllegalArgumentException("Impossibile dividere per zero.");
        }
        else return a/b;
    }
}