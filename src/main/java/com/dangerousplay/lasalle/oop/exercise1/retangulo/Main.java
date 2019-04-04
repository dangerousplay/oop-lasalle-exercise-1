package com.dangerousplay.lasalle.oop.exercise1.retangulo;

import com.dangerousplay.lasalle.oop.exercise1.retangulo.models.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do retângulo: ");
        final var lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do retângulo: ");
        final var lado2 = scanner.nextDouble();

        final var retangulo = new Retangulo(lado1, lado2);


        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
