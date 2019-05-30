package model;

public class CriancaFeminino extends Pessoa {

    public CriancaFeminino() {
        super();
    }

    public String calcularPercentil(double imc, int idade) {
        String resultado;

        switch (idade) {
        case 1:
            resultado = CalcularPercentilFeminino.percentil2(imc);
            break;
        
        case 2:
            resultado = CalcularPercentilFeminino.percentil2(imc);
            break;
        case 3:
            resultado = CalcularPercentilFeminino.percentil3(imc);
            break;
        case 4:
            resultado = CalcularPercentilFeminino.percentil4(imc);
            break;
        case 5:
            resultado = CalcularPercentilFeminino.percentil5(imc);
            break;
        case 6:
            resultado = CalcularPercentilFeminino.percentil6(imc);
            break;
        case 7:
            resultado = CalcularPercentilFeminino.percentil7(imc);
            break;
        case 8:
            resultado = CalcularPercentilFeminino.percentil8(imc);
            break;
        case 9:
            resultado = CalcularPercentilFeminino.percentil9(imc);
            break;
        case 10:
            resultado = CalcularPercentilFeminino.percentil10(imc);
            break;
        case 11:
            resultado = CalcularPercentilFeminino2.percentil11(imc);
            break;
        case 12:
            resultado = CalcularPercentilFeminino2.percentil12(imc);
            break;
        case 13:
            resultado = CalcularPercentilFeminino2.percentil13(imc);
            break;
        case 14:
            resultado = CalcularPercentilFeminino2.percentil14(imc);
            break;
        case 15:
            resultado = CalcularPercentilFeminino2.percentil15(imc);
            break;
        case 16:
            resultado = CalcularPercentilFeminino2.percentil16(imc);
            break;
        case 17:
            resultado = CalcularPercentilFeminino2.percentil17(imc);
            break;
        case 18:
            resultado = CalcularPercentilFeminino2.percentil18(imc);
            break;
        case 19:
            resultado = CalcularPercentilFeminino2.percentil19(imc);
            break;
        case 20:
            resultado = CalcularPercentilFeminino2.percentil20(imc);
            break;
        default:
            resultado = "Idade não encontrada!";
        }
        return resultado;
    }
}
