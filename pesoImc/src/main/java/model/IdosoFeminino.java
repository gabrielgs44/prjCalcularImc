package model;

public class IdosoFeminino extends Pessoa {

    public IdosoFeminino() {
        super();
    }

    public String calcularResultadoFeminino(double imc) {
        String resultado;

        if (imc < 21.9) {
            resultado = TipoResultado.baixoPeso();
        } else if ((imc >= 22.0) && (imc <= 27.0)) {
            resultado = TipoResultado.pesoNormal();
        } else if ((imc > 27.00) && (imc < 32.1)) {
            resultado = TipoResultado.sobrepeso();
        } else if ((imc > 32.0) && (imc <= 37.0)) {
            resultado = TipoResultado.obesidadeI();
        } else if ((imc > 37.0) && (imc < 42.0)) {
            resultado = TipoResultado.obesidadeII();
        } else {
            resultado = TipoResultado.obesidadeIII();
        }

        return resultado;
    }

}