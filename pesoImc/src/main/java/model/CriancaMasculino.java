package model;

public class CriancaMasculino extends Pessoa {

    public CriancaMasculino() {
        super();
    }

    public String calcularPercentil(double imc, int idade) {
        String resultado;

        switch (idade) {
        case 2:
            resultado = CalcularPercentilMasculino.percentil2(imc);
            break;
        case 3:
            resultado = CalcularPercentilMasculino.percentil3(imc);
            break;
        case 4:
            resultado = CalcularPercentilMasculino.percentil4(imc);
            break;
        case 5:
            resultado = CalcularPercentilMasculino.percentil5(imc);
            break;
        case 6:
            resultado = CalcularPercentilMasculino.percentil6(imc);
            break;
        case 7:
            resultado = CalcularPercentilMasculino.percentil7(imc);
            break;
        case 8:
            resultado = CalcularPercentilMasculino.percentil8(imc);
            break;
        case 9:
            resultado = CalcularPercentilMasculino.percentil9(imc);
            break;
        case 10:
            resultado = CalcularPercentilMasculino.percentil10(imc);
            break;
        case 11:
            resultado = CalcularPercentilMasculino2.percentil11(imc);
            break;
        case 12:
            resultado = CalcularPercentilMasculino2.percentil12(imc);
            break;
        case 13:
            resultado = CalcularPercentilMasculino2.percentil13(imc);
            break;
        case 14:
            resultado = CalcularPercentilMasculino2.percentil14(imc);
            break;
        case 15:
            resultado = CalcularPercentilMasculino2.percentil15(imc);
            break;
        case 16:
            resultado = CalcularPercentilMasculino2.percentil16(imc);
            break;
        case 17:
            resultado = CalcularPercentilMasculino2.percentil17(imc);
            break;
        case 18:
            resultado = CalcularPercentilMasculino2.percentil18(imc);
            break;
        case 19:
            resultado = CalcularPercentilMasculino2.percentil19(imc);
            break;
        case 20:
            resultado = CalcularPercentilMasculino2.percentil20(imc);
            break;
        default:
            resultado = "Idade não encontrada!";
        }
        return resultado;
    }
}
