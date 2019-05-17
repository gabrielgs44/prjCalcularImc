package model;

public class Pessoa {
    private double peso, altura;
    private char sexo;
    private int idade;

    public Pessoa() {
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

        return peso / Math.pow(altura, 2);
    }

    public String resultado(double imc) {

        if (imc < 16.0) {
            return "Baixo peso muito grave";
        } else if ((imc >= 16.0) && (imc < 17.0)) {
            return "Baixo peso grave";
        } else if ((imc >= 17.0) && (imc < 18.50)) {
            return "Baixo peso";
        } else if ((imc >= 18.50) && (imc < 25.0)) {
            return "Peso normal";
        } else if ((imc >= 25.0) && (imc < 30.0)) {
            return "Sobrepeso";
        } else if ((imc >= 30.0) && (imc < 35.0)) {
            return "Obesidade grau I";
        } else if ((imc >= 35.0) && (imc < 40.0)) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }

    }

}
