package model;

public class Pessoa extends TipoResultado {
    private double peso, altura, imc;
    private char sexo;
    private int idade;

    public Pessoa() {
        super();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularImc(double peso, double altura) {
        return this.peso / Math.pow(this.altura, 2);
    }

    public String calcularResultado(double imc) {
        if (imc < 16.0) {
            return muitoGrave();
        } else if ((imc >= 16.0) && (imc < 17.0)) {
            return grave();
        } else if ((imc >= 17.0) && (imc < 18.50)) {
            return baixoPeso();
        } else if ((imc >= 18.50) && (imc < 25.0)) {
            return pesoNormal();
        } else if ((imc >= 25.0) && (imc < 30.0)) {
            return sobrepeso();
        } else if ((imc >= 30.0) && (imc < 35.0)) {
            return obesidadeI();
        } else if ((imc >= 35.0) && (imc < 40.0)) {
            return obesidadeII();
        } else {
            return obesidadeIII();
        }
    }
}
