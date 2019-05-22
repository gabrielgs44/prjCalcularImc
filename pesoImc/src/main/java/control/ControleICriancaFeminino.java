package control;

import model.CriancaFeminino;

public class ControleICriancaFeminino {
    CriancaFeminino criFemi;

    public void InserirCriancaFeminino(double altura, double peso, int idade, char sexo) {

        criFemi.setAltura(altura);
        criFemi.setPeso(peso);
        criFemi.setIdade(idade);
        criFemi.setSexo(sexo);

    }

    public CriancaFeminino obterCriancaFeminino() {
        return criFemi;
    }
}
