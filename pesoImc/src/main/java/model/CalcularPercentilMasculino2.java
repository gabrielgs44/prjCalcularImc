package model;

public class CalcularPercentilMasculino2 {
    public static String percentil11(double imc) {
        if (imc <= 15.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.0 && imc <= 20.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 20.2 && imc <= 23.2) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil12(double imc) {
        if (imc <= 15.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.4 && imc <= 21.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 21.0 && imc <= 24.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil13(double imc) {
        if (imc <= 16.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 16.0 && imc <= 21.8) {
            return TipoResultado.pesoNormal();
        } else if (imc > 21.8 && imc <= 25.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil14(double imc) {
        if (imc <= 16.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 16.4 && imc <= 22.6) {
            return TipoResultado.pesoNormal();
        } else if (imc > 22.6 && imc <= 26.0) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil15(double imc) {
        if (imc <= 17.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 17.0 && imc <= 23.4) {
            return TipoResultado.pesoNormal();
        } else if (imc > 23.4 && imc <= 26.8) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil16(double imc) {
        if (imc <= 17.8) {
            return TipoResultado.baixoPeso();
        } else if (imc > 17.8 && imc <= 24.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 24.2 && imc <= 27.6) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil17(double imc) {
        if (imc <= 18.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 18.4 && imc <= 25.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 25.0 && imc <= 28.2) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil18(double imc) {
        if (imc <= 18.9) {
            return TipoResultado.baixoPeso();
        } else if (imc > 18.9 && imc <= 25.6) {
            return TipoResultado.pesoNormal();
        } else if (imc > 25.6 && imc <= 28.9) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil19(double imc) {
        if (imc <= 19.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 19.4 && imc <= 26.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 26.2 && imc <= 29.7) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil20(double imc) {
        if (imc <= 19.9) {
            return TipoResultado.baixoPeso();
        } else if (imc > 19.9 && imc <= 27.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 27.0 && imc <= 30.4) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
}
