package br.edu.unigranrio.pesoImc;

public class Pessoa {
    private float peso, altura;
    private int idade;
    private char sexo;
    private String resultado;
    private double imc;

    public Pessoa() {
        
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public double calcularImc(float peso, float altura) {
        
        imc = peso / Math.pow(altura, 2);
        
        return imc;
        
    }
    
    public String calcularResultado(double imc) {
        
        if(imc < 16.0) {
            resultado = "Baixo peso muito grave";
        } 
        else if((imc >= 16.0) && (imc <= 16.99)) {
            resultado = "Baixo peso grave";
        } 
        else if((imc >= 17.0) && (imc <= 18.49)) {
            resultado = "Baixo peso";
        }
        else if((imc >= 18.50) && (imc <= 24.99)) {
            resultado = "Peso normal";
        }
        else if((imc >= 25.0) && (imc <= 29.99)) {
            resultado = "Sobrepeso";
        }
        else if((imc >= 30.0) && (imc <= 34.99)) {
            resultado = "Obesidade grau I";
        }
        else if((imc >= 35.0) && (imc <= 39.99)) {
            resultado = "Obesidade grau II";
        }
        else if(imc >= 40.0) {
            resultado = "Obesidade grau III (obesidade mórbida)";
        }
        
        
        return resultado;
    }
}
