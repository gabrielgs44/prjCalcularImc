package model;

public class IdosoMasculino extends Pessoa {

    public IdosoMasculino() {
        super();
    }

    public String calcularResultado(double imc) {
        String resultado;

        if (imc < 22.0) {
            resultado = TipoResultado.baixoPeso();
        } else if ((imc >= 22.0) && (imc < 27.1)) {
            resultado = TipoResultado.pesoNormal();
        } else if ((imc > 27.0) && (imc < 30.1)) {
            resultado = TipoResultado.sobrepeso();
        } else if ((imc > 30.0) && (imc <= 35.0)) {
            resultado = TipoResultado.obesidadeI();
        } else if ((imc > 35.0) && (imc < 40.0)) {
            resultado = TipoResultado.obesidadeII();
        } else {
            resultado = TipoResultado.obesidadeIII();
        }

        return resultado;
    }
}
