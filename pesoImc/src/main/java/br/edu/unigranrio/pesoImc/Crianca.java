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
}
