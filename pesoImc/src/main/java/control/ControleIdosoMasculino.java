package control;

import model.IdosoMasculino;

public class ControleIdosoMasculino {
    IdosoMasculino idMasc;

    public void InserirIdosoMasculino(double altura, double peso, int idade, char sexo) {

        idMasc.setAltura(altura);
        idMasc.setPeso(peso);
        idMasc.setIdade(idade);
        idMasc.setSexo(sexo);

    }

    public IdosoMasculino obterIdosoMasculino() {
        return idMasc;
    }
}
