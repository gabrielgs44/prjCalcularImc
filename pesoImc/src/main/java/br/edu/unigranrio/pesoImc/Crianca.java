package br.edu.unigranrio.pesoImc;

public class Crianca {
    private double imc;

    public Crianca() {
        super();
    }

    public double CalcularImc(float peso, float altura, char sexo, String resultado) {

        imc = peso / Math.pow(altura, 2);

        return imc;
    }

    public String calcularPorcentilFeminino(double imc, String resultado, char sexo, int idade) {

            switch (idade) {
            case 2:
                if (imc <= 15.0) {
                    resultado = "Baixo Peso";

                } else if (imc > 15.0 && imc <= 18) {
                    resultado = "Peso Normal";
                }

                else if (imc > 18 && imc <= 19.2) {
                    resultado = "Sobrepeso";
                } else if (imc > 19.2) {
                    resultado = "Obesidade";
                }
                break;

            case 3:
                if (imc <= 14.6) {
                    resultado = "Baixo Peso";
                } else if (imc > 14.6 && imc <= 17.2) {
                    resultado = "Peso Normal";
                }

                else if (imc > 17.2 && imc <= 18.4) {
                    resultado = "Sobrepeso";
                } else if (imc > 18.4) {
                    resultado = "Obesidade";
                }
            case 4:
                if (imc <= 14.15) {
                    resultado = "Baixo Peso";
                } else if (imc > 14.15 && imc <= 16.8) {
                    resultado = "Peso Normal";
                }

                else if (imc > 16.8 && imc <= 18.0) {
                    resultado = "Sobrepeso";
                } else if (imc > 18.0) {
                    resultado = "Obesidade";
                }
                break;
            case 5: 
                if (imc <= 14.15) {
                    resultado = "Baixo Peso";
                } else if (imc > 14.15 && imc <= 16.8) {
                    resultado = "Peso Normal";
                }

                else if (imc > 16.8 && imc <= 18.0) {
                    resultado = "Sobrepeso";
                } else if (imc > 18.0) {
                    resultado = "Obesidade";
                }
                break;
            }
        

        return resultado;
    }
    
    public String calcularPorcentilMasculino(double imc, String resultado, char sexo, int idade) {

        switch (idade) {
        case 2:
            if (imc <= 15.0) {
                resultado = "Baixo Peso";

            } else if (imc > 15.0 && imc <= 18.2) {
                resultado = "Peso Normal";
            }

            else if (imc > 18.2 && imc <= 19.2) {
                resultado = "Sobrepeso";
            } else if (imc > 19.2) {
                resultado = "Obesidade";
            }
            break;

        case 3:
            if (imc <= 14.6) {
                resultado = "Baixo Peso";
            } else if (imc > 14.6 && imc <= 17.4) {
                resultado = "Peso Normal";
            }

            else if (imc > 17.4 && imc <= 18.2) {
                resultado = "Sobrepeso";
            } else if (imc > 18.2) {
                resultado = "Obesidade";
            }
        case 4:
            if (imc <= 14.4) {
                resultado = "Baixo Peso";
            } else if (imc > 14.4 && imc <= 17.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 17.0 && imc <= 17.8) {
                resultado = "Sobrepeso";
            } else if (imc > 17.8) {
                resultado = "Obesidade";
            }
            break;
        case 5: 
            if (imc <= 14.2) {
                resultado = "Baixo Peso";
            } else if (imc > 14.2 && imc <= 16.8) {
                resultado = "Peso Normal";
            }

            else if (imc > 16.8 && imc <= 18.0) {
                resultado = "Sobrepeso";
            } else if (imc > 18.0) {
                resultado = "Obesidade";
            }
            break;
        case 6: 
            if (imc <= 14.0) {
                resultado = "Baixo Peso";
            } else if (imc > 14.0 && imc <= 17.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 17.0 && imc <= 18.4) {
                resultado = "Sobrepeso";
            } else if (imc > 18.4) {
                resultado = "Obesidade";
            }
            break;
        case 7: 
            if (imc <= 14.0) {
                resultado = "Baixo Peso";
            } else if (imc > 14.0 && imc <= 17.4) {
                resultado = "Peso Normal";
            }

            else if (imc > 17.4 && imc <= 19.0) {
                resultado = "Sobrepeso";
            } else if (imc > 19.0) {
                resultado = "Obesidade";
            }
            break;
        case 8: 
            if (imc <= 14.2) {
                resultado = "Baixo Peso";
            } else if (imc > 14.2 && imc <= 18.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 18.0 && imc <= 20.0) {
                resultado = "Sobrepeso";
            } else if (imc > 20.0) {
                resultado = "Obesidade";
            }
            break;
        case 9: 
            if (imc <= 14.4) {
                resultado = "Baixo Peso";
            } else if (imc > 14.4 && imc <= 18.4) {
                resultado = "Peso Normal";
            }

            else if (imc > 18.6 && imc <= 21.0) {
                resultado = "Sobrepeso";
            } else if (imc > 21.0) {
                resultado = "Obesidade";
            }
            break;
        case 10: 
            if (imc <= 14.8) {
                resultado = "Baixo Peso";
            } else if (imc > 14.8 && imc <= 19.4) {
                resultado = "Peso Normal";
            }

            else if (imc > 19.4 && imc <= 22.0) {
                resultado = "Sobrepeso";
            } else if (imc > 22.0) {
                resultado = "Obesidade";
            }
            break;
        case 11: 
            if (imc <= 15.0) {
                resultado = "Baixo Peso";
            } else if (imc > 15.0 && imc <= 20.2) {
                resultado = "Peso Normal";
            }

            else if (imc > 20.2 && imc <= 23.2) {
                resultado = "Sobrepeso";
            } else if (imc > 23.2) {
                resultado = "Obesidade";
            }
            break;
        case 12: 
            if (imc <= 15.4) {
                resultado = "Baixo Peso";
            } else if (imc > 15.4 && imc <= 21.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 21.0 && imc <= 24.0) {
                resultado = "Sobrepeso";
            } else if (imc > 24.0) {
                resultado = "Obesidade";
            }
            break;
        case 13: 
            if (imc <= 16.0) {
                resultado = "Baixo Peso";
            } else if (imc > 16.0 && imc <= 21.8) {
                resultado = "Peso Normal";
            }

            else if (imc > 21.8 && imc <= 25.0) {
                resultado = "Sobrepeso";
            } else if (imc > 25.0) {
                resultado = "Obesidade";
            }
            break;
        case 14: 
            if (imc <= 16.4) {
                resultado = "Baixo Peso";
            } else if (imc > 16.4 && imc <= 22.6) {
                resultado = "Peso Normal";
            }

            else if (imc > 22.6 && imc <= 26.0) {
                resultado = "Sobrepeso";
            } else if (imc > 26.0) {
                resultado = "Obesidade";
            }
            break;
        case 15: 
            if (imc <= 17.0) {
                resultado = "Baixo Peso";
            } else if (imc > 17.0 && imc <= 23.4) {
                resultado = "Peso Normal";
            }

            else if (imc > 23.4 && imc <= 26.8) {
                resultado = "Sobrepeso";
            } else if (imc > 26.8) {
                resultado = "Obesidade";
            }
            break;
        case 16: 
            if (imc <= 17.8) {
                resultado = "Baixo Peso";
            } else if (imc > 17.8 && imc <= 24.2) {
                resultado = "Peso Normal";
            }

            else if (imc > 24.2 && imc <= 27.6) {
                resultado = "Sobrepeso";
            } else if (imc > 27.6) {
                resultado = "Obesidade";
            }
            break;
        case 17: 
            if (imc <= 18.4) {
                resultado = "Baixo Peso";
            } else if (imc > 18.4 && imc <= 25.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 25.0 && imc <= 28.2) {
                resultado = "Sobrepeso";
            } else if (imc > 28.2) {
                resultado = "Obesidade";
            }
            break;
        case 18: 
            if (imc <= 18.9) {
                resultado = "Baixo Peso";
            } else if (imc > 18.9 && imc <= 25.6) {
                resultado = "Peso Normal";
            }

            else if (imc > 25.6 && imc <= 28.9) {
                resultado = "Sobrepeso";
            } else if (imc > 28.9) {
                resultado = "Obesidade";
            }
            break;
        case 19: 
            if (imc <= 19.4) {
                resultado = "Baixo Peso";
            } else if (imc > 19.4 && imc <= 26.2) {
                resultado = "Peso Normal";
            }

            else if (imc > 26.2 && imc <= 29.7) {
                resultado = "Sobrepeso";
            } else if (imc > 29.7) {
                resultado = "Obesidade";
            }
            break;
        case 20: 
            if (imc <= 19.9) {
                resultado = "Baixo Peso";
            } else if (imc > 19.9 && imc <= 27.0) {
                resultado = "Peso Normal";
            }

            else if (imc > 27.0 && imc <= 30.4) {
                resultado = "Sobrepeso";
            } else if (imc > 30.4) {
                resultado = "Obesidade";
            }
            break;
            
        }
    

    return resultado;
}
}
