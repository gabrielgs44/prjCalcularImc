package control;

import model.CriancaMasculino;

public class ControleCriancaMasculino {
    CriancaMasculino criMasc;

    public void InserirCriancaMasculino(double altura, double peso, int idade, char sexo) {

        criMasc.setAltura(altura);
        criMasc.setPeso(peso);
        criMasc.setIdade(idade);
        criMasc.setSexo(sexo);

    }

    public CriancaMasculino obterCriancaMasculino() {
        return criMasc;
    }
}
