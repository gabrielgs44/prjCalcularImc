package control;

import model.Pessoa;

public class ControlePessoa {
    Pessoa pessoa = new Pessoa();

    public void inserirPessoa(double altura, double peso, int idade, char sexo) {
        pessoa.setAltura(altura);
        pessoa.setPeso(peso);
        pessoa.setSexo(sexo);
        pessoa.setIdade(idade);
    }

    public Pessoa obterPessoa() {
        return pessoa;
    }
}
