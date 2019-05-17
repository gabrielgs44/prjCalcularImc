package br.edu.unigranrio.pesoImc;

public class Menina{
    
    public Menina() {
        super ();
    }
    
    public final String calcularPorcentil(double imc, int idade) {
        String resultado = null;
        
        switch (idade) {
        case 2:
            if (imc <= 15.0) {
                resultado = "Baixo Peso";

            } 
            
            else if (imc > 15.0 && imc <= 18) {
                resultado = "Peso Normal";
            }

            else if (imc > 18 && imc <= 19.2) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 19.2) {
                resultado = "Obesidade";
            }
            break;

        case 3:
            if (imc <= 14.6) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 14.6 && imc <= 17.2) {
                resultado = "Peso Normal";
            }

            else if (imc > 17.2 && imc <= 18.4) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 18.4) {
                resultado = "Obesidade";
            }
        case 4:
            if (imc <= 14.15) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 14.15 && imc <= 16.8) {
                resultado = "Peso Normal";
            }

            else if (imc > 16.8 && imc <= 18.0) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 18.0) {
                resultado = "Obesidade";
            }
            break;
        case 5: 
            if (imc <= 13.8) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 13.8 && imc <= 16.8) {
                resultado = "Peso Normal";
            }

            else if (imc > 16.8 && imc <= 18.24) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 18.24) {
                resultado = "Obesidade";
            }
            break;
        case 6: 
            if (imc <= 13.8) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 13.8 && imc <= 17.04) {
                resultado = "Peso Normal";
            }

            else if (imc > 17.4 && imc <= 18.6) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 18.6) {
                resultado = "Obesidade";
            }
            break;
        case 7: 
            if (imc <= 13.8) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 13.8 && imc <= 17.6) {
                resultado = "Peso Normal";
            }

            else if (imc > 17.6 && imc <= 19.4) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 19.4) {
                resultado = "Obesidade";
            }
            break;
            
        case 8: 
            if (imc <= 14.0) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 14.0 && imc <= 18.2) {
                resultado = "Peso Normal";
            }

            else if (imc > 18.2 && imc <= 20.6) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 20.6) {
                resultado = "Obesidade";
            }
            break;
        case 9: 
            if (imc <= 14.2) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 14.2 && imc <= 19.1) {
                resultado = "Peso Normal";
            }

            else if (imc > 19.1 && imc <= 21.20) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 21.20) {
                resultado = "Obesidade";
            }
            break;
        case 10:
            if (imc <= 14.4) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 14.4 && imc <= 20.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 20.0 && imc <= 22.97) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 22.97) {
                resultado = "Obesidade";
            }
            break;
        case 11:
            if (imc <= 15.0) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 15.0 && imc <= 20.8) {
                resultado = "Peso Normal";
            }

            else if (imc > 20.8 && imc <= 24.05) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 24.05) {
                resultado = "Obesidade";
            }
            break;
        case 12:
            if (imc <= 15.4) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 15.4 && imc <= 21.8) {
                resultado = "Peso Normal";
            }

            else if (imc > 21.8 && imc <= 25.1) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 25.1) {
                resultado = "Obesidade";
            }
            break;
        case 13:
            if (imc <= 15.9) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 15.9 && imc <= 22.45) {
                resultado = "Peso Normal";
            }

            else if (imc > 22.45 && imc <= 26.2) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 26.2) {
                resultado = "Obesidade";
            }
            break;
        case 14:
            if (imc <= 16.43) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 16.43 && imc <= 23.3) {
                resultado = "Peso Normal";
            }

            else if (imc > 23.3 && imc <= 27.2) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 27.2) {
                resultado = "Obesidade";
            }
            break;
        case 15:
            if (imc <= 16.95) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 16.95 && imc <= 24.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 24.0 && imc <= 28.03) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 28.03) {
                resultado = "Obesidade";
            }
            break;
        case 16:
            if (imc <= 17.4) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 17.4 && imc <= 24.6) {
                resultado = "Peso Normal";
            }

            else if (imc > 24.6 && imc <= 28.8) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 28.8) {
                resultado = "Obesidade";
            }
            break;
        case 17:
            if (imc <= 17.9) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 17.9 && imc <= 25.2) {
                resultado = "Peso Normal";
            }

            else if (imc > 25.2 && imc <= 29.6) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 29.6) {
                resultado = "Obesidade";
            }
            break;
        case 18:
            if (imc <= 18.2) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 18.2 && imc <= 25.6) {
                resultado = "Peso Normal";
            }

            else if (imc > 25.6 && imc <= 30.2) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 30.2) {
                resultado = "Obesidade";
            }
            break;
        case 19:
            if (imc <= 18.4) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 18.4 && imc <= 26.1) {
                resultado = "Peso Normal";
            }

            else if (imc > 26.1 && imc <= 30.98) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 30.98) {
                resultado = "Obesidade";
            }
            break;
        case 20:
            if (imc <= 18.45) {
                resultado = "Baixo Peso";
            } 
            
            else if (imc > 18.45 && imc <= 26.6) {
                resultado = "Peso Normal";
            }

            else if (imc > 26.6 && imc <= 31.75) {
                resultado = "Sobrepeso";
            } 
            
            else if (imc > 31.75) {
                resultado = "Obesidade";
            }
            break;
        }

        return resultado;
    }
}
