package com.company;

import java.util.Scanner;
//todo arruma a formatação daqui vei
public class ExercicioDemonstracao {
    //        Referência tipos de variaveis;
//
//        int numeroInt = 1;
//        double numeroDouble = 1231231.231234532;
//        String string;
//        boolean booleano;

    public ExercicioDemonstracao() {
    }

    void run() {
        //Chama o Scanner
        //https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        Scanner scanner = new Scanner(System.in);
        //        Exercicio Demonstracao
//        Crie um programa que receba dois numeros inteiros,
//        some os dois numeros e armazene em uma variavel,
//        depois exiba o resultado armazenado,
//        CRITERIO DE ACEITE - O programa precisa interagir com linguagem humana ao solicitar os dados ou exibir os dados.

        int primeiroNumero;
        int segundoNumero;
        int resultadoSoma;


        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        segundoNumero = scanner.nextInt();

        resultadoSoma = primeiroNumero + segundoNumero;

        System.out.println("O resultado da soma é: " + resultadoSoma);


    }

}
