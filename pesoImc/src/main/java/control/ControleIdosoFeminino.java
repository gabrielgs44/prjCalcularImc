package control;

import model.IdosoFeminino;

public class ControleIdosoFeminino {
    IdosoFeminino idFemi;
    
    public void InserirIdosoFeminino(double altura, double peso, int idade, char sexo) {
        
        idFemi.setAltura(altura);
        idFemi.setPeso(peso);
        idFemi.setIdade(idade);
        idFemi.setSexo(sexo);
        
    }
    
    public IdosoFeminino obterIdosoFeminino() {
        return idFemi;
    }
}
