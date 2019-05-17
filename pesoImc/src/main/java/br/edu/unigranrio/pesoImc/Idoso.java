package br.edu.unigranrio.pesoImc;

public class Idoso{
    private String resultado;
    public Idoso() {
        super ();
    }
    
    public final String calcularResultado(double imc, char sexo) {
         
        switch(sexo) {
        
        case 'f':
            if(imc < 21.9) {
                resultado = "Baixo peso";
            }
            else if((imc >= 22.0) && (imc <= 27.0)) {
                resultado = "Peso normal";
            }
            else if((imc > 27.00) && (imc < 32.1)) {
                resultado = "Sobrepeso";
            }
            else if((imc >= 32.1) && (imc <= 37.0)) {
                resultado = "Obesidade grau I";
            }
            else if((imc > 37.0) && (imc < 42.0)) {
                resultado = "Obesidade grau II";
            }
            else if(imc >= 42.00) {
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
            else if((imc > 27.0) && (imc <= 30.0)) {
                return "Sobrepeso";
            }
            else if((imc > 30.0) && (imc < 35.0)) {
                return "Obesidade grau I";
            }
            else if((imc > 35.0) && (imc <= 39.9)) {
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
