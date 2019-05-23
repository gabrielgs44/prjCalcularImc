package model;

public class CalcularPercentilFeminino {
    public static String percentil2(double imc) {
        if (imc <= 15.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.0 && imc <= 18) {
            return TipoResultado.pesoNormal();
        } else if (imc > 18 && imc <= 19.2) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil3(double imc) {
        if (imc <= 14.6) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.6 && imc <= 17.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 17.2 && imc <= 18.4) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil4(double imc) {
        if (imc <= 14.15) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.15 && imc <= 16.8) {
            return TipoResultado.pesoNormal();
        } else if (imc > 16.8 && imc <= 18.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil5(double imc) {
        if (imc <= 13.8) {
            return TipoResultado.baixoPeso();
        } else if (imc > 13.8 && imc <= 16.8) {
            return TipoResultado.pesoNormal();
        } else if (imc > 16.8 && imc <= 18.24) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil6(double imc) {
        if (imc <= 13.8) {
            return TipoResultado.baixoPeso();
        } else if (imc > 13.8 && imc <= 17.04) {
            return TipoResultado.pesoNormal();
        } else if (imc > 17.4 && imc <= 18.6) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil7(double imc) {
        if (imc <= 13.8) {
            return TipoResultado.baixoPeso();
        } else if (imc > 13.8 && imc <= 17.6) {
            return TipoResultado.pesoNormal();
        } else if (imc > 17.6 && imc <= 19.4) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil8(double imc) {
        if (imc <= 14.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.0 && imc <= 18.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 18.2 && imc <= 20.6) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil9(double imc) {
        if (imc <= 14.2) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.2 && imc <= 19.1) {
            return TipoResultado.pesoNormal();
        } else if (imc > 19.1 && imc <= 21.20) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil10(double imc) {
        if (imc <= 14.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 14.4 && imc <= 20.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 20.0 && imc <= 22.97) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
}
