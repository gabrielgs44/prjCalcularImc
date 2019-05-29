package model;

public class CalcularPercentilMasculino {
    public static String percentil2(double imc) {
        if (imc <= 15.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.0 && imc <= 18.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 18.2 && imc <= 19.2) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil3(double imc) {
        if (imc <= 14.6) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.6 && imc <= 17.4) {
            return TipoResultado.pesoNormal();
        } else if (imc > 17.4 && imc <= 18.2) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil4(double imc) {
        if (imc <= 14.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.4 && imc <= 17.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 17.0 && imc <= 17.8) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil5(double imc) {
        if (imc <= 14.2) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.2 && imc <= 16.8) {
            return TipoResultado.pesoNormal();
        } else if (imc > 16.8 && imc <= 18.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil6(double imc) {
        if (imc <= 14.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.0 && imc <= 17.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 17.0 && imc <= 18.4) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil7(double imc) {
        if (imc <= 14.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.0 && imc <= 17.4) {
            return TipoResultado.pesoNormal();
        } else if (imc > 17.4 && imc <= 19.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil8(double imc) {
        if (imc <= 14.2) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.2 && imc <= 18.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 18.0 && imc <= 20.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil9(double imc) {
        if (imc <= 14.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.4 && imc <= 18.6) {
            return TipoResultado.pesoNormal();
        } else if (imc > 18.6 && imc <= 21.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil10(double imc) {
        if (imc <= 14.8) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.8 && imc <= 19.4) {
            return TipoResultado.pesoNormal();
        } else if (imc > 19.4 && imc <= 22.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

}
