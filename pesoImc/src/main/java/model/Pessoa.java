package model;

public class Pessoa{
    private double peso, altura, imc;
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
        return peso / Math.pow(altura, 2);
    }

    public String calcularResultado(double imc) {
        String resultado = null;
        if (imc < 16.0) {
            resultado = TipoResultado.muitoGrave();
        } else if (imc >= 16.0 && imc < 17.0) {
            resultado = TipoResultado.grave();
        } else if (imc >= 17.0 && imc < 18.50) {
            resultado = TipoResultado.baixoPeso();
        } else if (imc >= 18.50 && imc < 25.0) {
            resultado = TipoResultado.pesoNormal();
        } else if (imc >= 25.0 && imc < 30.0) {
            resultado = TipoResultado.sobrepeso();
        } else if (imc >= 30.0 && imc < 35.0) {
            resultado = TipoResultado.obesidadeI();
        } else if (imc >= 35.0 && imc < 40.0) {
            resultado = TipoResultado.obesidadeII();
        } else if(imc > 40){
            resultado = TipoResultado.obesidadeIII();
        }
        return resultado;
    }
}
