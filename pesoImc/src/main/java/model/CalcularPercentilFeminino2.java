package model;

public class CalcularPercentilFeminino2 {
    public static String percentil11(double imc) {
        if (imc <= 15.0) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.0 && imc <= 20.8) {
            return TipoResultado.pesoNormal();
        } else if (imc > 20.8 && imc <= 24.05) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil12(double imc) {
        if (imc <= 15.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.4 && imc <= 21.8) {
            return TipoResultado.pesoNormal();
        } else if (imc > 21.8 && imc <= 25.1) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil13(double imc) {
        if (imc <= 15.9) {
            return TipoResultado.baixoPeso();
        } else if (imc > 15.9 && imc <= 22.45) {
            return TipoResultado.pesoNormal();
        } else if (imc > 22.45 && imc <= 26.2) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil14(double imc) {
        if (imc <= 16.43) {
            return TipoResultado.baixoPeso();
        } else if (imc > 16.43 && imc <= 23.3) {
            return TipoResultado.pesoNormal();
        } else if (imc > 23.3 && imc <= 27.2) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil15(double imc) {
        if (imc <= 16.95) {
            return TipoResultado.baixoPeso();
        } else if (imc > 16.95 && imc <= 24.0) {
            return TipoResultado.pesoNormal();
        } else if (imc > 24.0 && imc <= 28.03) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }

    public static String percentil16(double imc) {
        if (imc <= 17.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 17.4 && imc <= 24.6) {
            return TipoResultado.pesoNormal();
        } else if (imc > 24.6 && imc <= 28.8) {
            return TipoResultado.sobrepeso();
        } else {
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
    public static String percentil17(double imc) {
        if (imc <= 17.9) {
            return TipoResultado.baixoPeso();
        } else if (imc > 17.9 && imc <= 25.2) {
            return TipoResultado.pesoNormal();
        } else if (imc > 25.2 && imc <= 29.6) {
            return TipoResultado.sobrepeso();
        } else{
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
    public static String percentil18(double imc) {
        if (imc <= 18.2) {
            return TipoResultado.baixoPeso();
        } else if (imc > 18.2 && imc <= 25.6) {
            return TipoResultado.pesoNormal();
        } else if (imc > 25.6 && imc <= 30.2) {
            return TipoResultado.sobrepeso();
        } else{
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
    public static String percentil19(double imc) {
        if (imc <= 18.4) {
            return TipoResultado.baixoPeso();
        } else if (imc > 18.4 && imc <= 26.1) {
            return TipoResultado.pesoNormal();
        } else if (imc > 26.1 && imc <= 30.98) {
            return TipoResultado.sobrepeso();
        } else{
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
    public static String percentil20(double imc) {
        if (imc <= 18.45) {
            return TipoResultado.baixoPeso();
        } else if (imc > 18.45 && imc <= 26.6) {
            return TipoResultado.pesoNormal();
        } else if (imc > 26.6 && imc <= 31.75) {
            return TipoResultado.sobrepeso();
        } else{
            return TipoResultado.obesidadeI().substring(0, 9);
        }
    }
}
