package control;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws SexoException{
        Scanner leia = new Scanner(System.in);
        
        char sexo;
        double imc = 0;
        String resultado = null;
               
        do {       
        System.out.print("Digite o seu sexo (F OU M): ");
        sexo = leia.next().toUpperCase().charAt(0);
        
        try {
            if(sexo != 'M' && sexo != 'F')
                throw new SexoException(sexo);
        }catch(SexoException e) {
            System.out.println("Problema: " + e.getMessage());
        }
        
        }while (sexo != 'M' && sexo != 'F');
        
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.print("Digite o seu peso: ");
        double peso = leia.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = leia.nextDouble();
        
        /*ControlePessoa contpessoa = new ControlePessoa();
        contpessoa.inserirPessoa(altura, peso, idade, sexo);
        double imc = contpessoa.obterPessoa().calcularImc(peso, altura);
        System.out.println("Seu imc: " + imc);
        System.out.println("Você está: " + contpessoa.obterPessoa().calcularResultado(imc));*/
        
        if(idade < 21 && sexo == 'M') {
        	ControleCriancaMasculino contCriancaMas = new ControleCriancaMasculino();
        	contCriancaMas.InserirCriancaMasculino(altura, peso, idade, sexo);
        	imc = contCriancaMas.obterCriancaMasculino().calcularImc(peso, altura);
        	resultado = contCriancaMas.criMasc.calcularPercentil(imc, idade);
        }
        
        System.out.println("Seu imc: " + imc);
        System.out.println("Você está: " + resultado);
    }

}
