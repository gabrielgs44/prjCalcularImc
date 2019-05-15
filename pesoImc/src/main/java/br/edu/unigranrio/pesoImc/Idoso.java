package br.edu.unigranrio.pesoImc;

public class Idoso extends Pessoa{
    
    public Idoso() {
        super ();
    }
    
    public String calculaResultado(char sexo, String resultado, double imc) {
         
        switch(sexo) {
        
        case 'f':
            if(imc < 21.9) {
                resultado = "Baixo peso";
            }
            else if((imc >= 22.0) && (imc <= 27.0)) {
                resultado = "Peso normal";
            }
            else if((imc >= 27.1) && (imc <= 32.0)) {
                resultado = "Sobrepeso";
            }
            else if((imc >= 32.1) && (imc < 37.0)) {
                resultado = "Obesidade grau I";
            }
            else if((imc >= 37.1) && (imc <= 41.9)) {
                resultado = "Obesidade grau II";
            }
            else if(imc >= 42.0) {
                resultado = "Obesidade grau III (obesidade mórbida)";
            }
            
            break;
        
        case 'm':
            if(imc < 21.9) {
                return "Baixo peso";
            }
            else if((imc >= 22.0) && (imc <= 27.0)) {
                return "Peso normal";
            }
            else if((imc >= 27.1) && (imc <= 30.0)) {
                return "Sobrepeso";
            }
            else if((imc >= 30.1) && (imc < 35.0)) {
                return "Obesidade grau I";
            }
            else if((imc >= 35.1) && (imc <= 39.9)) {
                return "Obesidade grau II";
            }
            else if(imc >= 40.0) {
                return "Obesidade grau III (obesidade mórbida)";
            }
            break;
            
        }
        
        return resultado;
    }
}
