package model;

public class CalcularPercentilMasculino {
    public static String percentil2(double imc) {

        if (imc <= 15.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.0 && imc <= 18.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 18.2 && imc <= 19.2) {
            return TipoResultado.sobrepeso();
        } else{
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
}
