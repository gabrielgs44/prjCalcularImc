package control;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws SexoException, PesoInvalidoException, AlturaInvalidaException {
        Scanner leia = new Scanner(System.in);

        char sexo = 'N';
        double imc = 0, peso = 0, altura = 0;
        String resultado;
        int idade = 0;
        boolean continueLoop;

        do {
            continueLoop = false;
            try {
                System.out.print("Digite o seu sexo (F OU M): ");
                sexo = leia.next().toUpperCase().charAt(0);
                if (sexo != 'M' && sexo != 'F')
                    throw new SexoException(sexo);

                System.out.print("Digite sua idade: ");
                idade = leia.nextInt();

                System.out.print("Digite o seu peso: ");
                peso = leia.nextDouble();
                if (peso <= 0)
                    throw new PesoInvalidoException(peso);

                System.out.print("Digite a sua altura: ");
                altura = leia.nextDouble();
                if (altura <= 0)
                    throw new AlturaInvalidaException(altura);

            } catch (SexoException e) {
                System.out.println("Problema: " + e.getMessage() + " Digite 'F' para Feminino ou 'M' Para Masculino!");
                continueLoop = true;
            } catch (PesoInvalidoException e) {
                System.out.println("Problema: " + e.getMessage());
                continueLoop = true;
            } catch (AlturaInvalidaException e) {
                System.out.println("Problema: " + e.getMessage());
                continueLoop = true;
            }

        } while (continueLoop == true);

        if (idade < 21 && sexo == 'M') {

            ControleCriancaMasculino contCriancaMas = new ControleCriancaMasculino();
            contCriancaMas.InserirCriancaMasculino(altura, peso, idade, sexo);
            imc = contCriancaMas.obterCriancaMasculino().calcularImc(peso, altura);
            resultado = contCriancaMas.criMasc.calcularPercentil(imc, idade);

        } else if (idade < 21 && sexo == 'F') {

            ControleCriancaFeminino contCriancaFem = new ControleCriancaFeminino();
            contCriancaFem.InserirCriancaFeminino(altura, peso, idade, sexo);
            imc = contCriancaFem.obterCriancaFeminino().calcularImc(peso, altura);
            resultado = contCriancaFem.criFemi.calcularPercentil(imc, idade);

        } else if (idade > 20 && idade < 66) {

            ControlePessoa contPes = new ControlePessoa();
            contPes.inserirPessoa(altura, peso, idade, sexo);
            imc = contPes.obterPessoa().calcularImc(peso, altura);
            resultado = contPes.pessoa.calcularResultado(imc);

        } else if (idade > 65 && sexo == 'M') {

            ControleIdosoMasculino contIdosoMas = new ControleIdosoMasculino();
            contIdosoMas.InserirIdosoMasculino(altura, peso, idade, sexo);
            imc = contIdosoMas.obterIdosoMasculino().calcularImc(peso, altura);
            resultado = contIdosoMas.idMasc.calcularResultado(imc);

        } else {

            ControleIdosoFeminino contIdosoFem = new ControleIdosoFeminino();
            contIdosoFem.InserirIdosoFeminino(altura, peso, idade, sexo);
            imc = contIdosoFem.obterIdosoFeminino().calcularImc(peso, altura);
            resultado = contIdosoFem.idFemi.calcularResultado(imc);

        }

        System.out.println("Seu imc: " + imc);
        System.out.println("Você está: " + resultado);
    }

}
