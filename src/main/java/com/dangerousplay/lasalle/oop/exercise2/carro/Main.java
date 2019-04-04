package com.dangerousplay.lasalle.oop.exercise2.carro;


import com.dangerousplay.lasalle.oop.exercise2.carro.models.Carro;

import java.util.Scanner;

/**
 * 1.Crie uma classe para representar um carro, com os atributos privados de marca, modelo, ano e quilometragem.
 * Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados do carro.
 * Crie um método para calcular quantos quilômetros o carro roda por ano, retorne essa distância e uma observação: "Carro roda muito" (mais de 10000 km/ano ou "Carro roda normal"
 * (menos de 10000 km/ano).
 * */
public class Main {

    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro: ");
        final var marca = scanner.next();

        System.out.println("Digite o modelo do carro: ");
        final var modelo = scanner.next();

        System.out.println("Digite o ano do carro (em inteiro): ");
        final var ano = scanner.nextInt();

        System.out.println("Digite a quilometragem do carro: ");
        final var quilometrage = scanner.nextDouble();

        final var carro = new Carro(marca, modelo, ano, quilometrage);
        System.out.println("Dados do carro: " + carro);

        final var quilometragem = carro.calcularQuilometragem();

        System.out.println("Quilometragem por ano (Média): " + quilometragem);

        if(quilometragem > 10000){
            System.out.println("Carro roda muito");
        } else {
            System.out.println("Carro roda normal");
        }

    }

}
