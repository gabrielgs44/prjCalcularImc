package control;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = leia.nextDouble();
        System.out.print("Digite seu Peso: ");
        double peso = leia.nextDouble();
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.print("Digite seu sexo: ");
        char sexo = leia.next().charAt(0);

        ControlePessoa contPessoa = new ControlePessoa();

        contPessoa.inserirPessoa(altura, peso, idade, sexo);

        //double imc = contPessoa.pessoa.calcularImc(peso, altura);
        double imc = contPessoa.obterImc(peso, altura);

        //String resultado = contPessoa.pessoa.resultado(imc);
        String resultado = contPessoa.obterResultado(imc);

        System.out.println("Seu imc é: " + imc);
        System.out.println("Você está: " + resultado);

    }

}
