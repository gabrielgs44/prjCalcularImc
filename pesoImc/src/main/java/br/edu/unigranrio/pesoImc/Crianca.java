package br.edu.unigranrio.pesoImc;

public abstract class Crianca extends Pessoa{
    private double imc;

    public Crianca() {
        super();
    }

    public double CalcularImc(float peso, float altura, char sexo, String resultado) {

        imc = peso / Math.pow(altura, 2);

        return imc;
    }
    
}
