package com.company;

import java.util.Scanner;

public class ExercicioUm {
//        Exercicio Um
//        Crie um programa que receba dois numeros inteiros,
//        subtraia os dois numeros e armazene em uma variavel,
//        depois exiba o resultado armazenado,
//        CRITERIO DE ACEITE - O programa precisa interagir com linguagem humana ao solicitar os dados ou exibir os dados.
//        Repita o mesmo exercício para as outras operações matemáticas


    Scanner scanner = new Scanner(System.in);

    void run() {
        //Seu código vem aqui!
        int numeroUm1;
        int numeroDois1;
        int resultadoSubtracao1;


        System.out.println("Digite o primeiro numero: ");
        numeroUm1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        numeroDois1 = scanner.nextInt();
        resultadoSubtracao1 = numeroUm1 - numeroDois1;

        System.out.println("O resultado da subtração é: " + resultadoSubtracao1 + " Meu consagrado");


    }

//        Exercicio Um
//        Crie um programa que receba quatro numeros, dois inteiros e dois fracionários (double),
//        subtraia os dois numeros inteiros e multiplique os numeros fracionários e armazene em uma variavel,
//        Divida o resultado por 4 e armazene em uma variavel,
//        Exiba o resultado da divisão,
//        CRITERIO DE ACEITE - O programa precisa interagir com linguagem humana ao solicitar os dados ou exibir os dados.
    void extra() {

        int inteiroUm;
        int inteiroDois;
        double fracionadoUm;
        double fracionadoDois;
        double resultadoSubtracao;
        double resultadoMultiplicacao;
        double divisaoUm;
        double divisaoDois;

        System.out.println("Digite o primeiro numero: ");
        inteiroUm = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        inteiroDois = scanner.nextInt();

        System.out.println("Digite o primeiro numero (fracionario): ");
        fracionadoUm = scanner.nextDouble();

        System.out.println("Digite o segundo numero (fracionario) : ");
        fracionadoDois = scanner.nextDouble();



        resultadoSubtracao = inteiroUm - inteiroDois;
        resultadoMultiplicacao = fracionadoUm * fracionadoDois;

        divisaoUm = resultadoSubtracao / 4;
        divisaoDois = resultadoMultiplicacao / 4;

        System.out.println("O resultado é: " + divisaoUm + " " + divisaoDois + " Meu consagrado");



    }

}
