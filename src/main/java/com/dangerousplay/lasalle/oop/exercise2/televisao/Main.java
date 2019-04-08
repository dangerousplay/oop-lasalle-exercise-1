package com.dangerousplay.lasalle.oop.exercise2.televisao;

import com.dangerousplay.lasalle.oop.exercise2.televisao.domain.Televisao;
import com.dangerousplay.lasalle.oop.exercise2.televisao.service.ControleRemoto;

import java.util.Scanner;

import static io.vavr.API.*;

/**
 * 3.Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão.
 * O controle de volume permite:
 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 * aumentar e diminuir o número do canal em uma unidade trocar para um canal indicado;
 * consultar o valor do volume de som e o canal selecionado.
 */
public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao controle remoto da televisão...");
        System.out.println("Ligando a televisão...");

        final var controle = new ControleRemoto(new Televisao());


        while (true) {
            System.out.println();
            System.out.println("Selecione uma das opções: ");
            System.out.println("1 - Aumentar o volume da televisão.");
            System.out.println("2 - Diminuir o volume da televisão.");
            System.out.println("3 - Trocar o canal da televisão.");
            System.out.println("4 - Próximo canal.");
            System.out.println("5 - Canal anterior.");
            System.out.println("6 - Ver estado da televisão.");
            System.out.println("7 - Desligar a televisão e sair.");
            System.out.println();

            final var opcao = scanner.nextInt();

            Match(opcao).of(
                    Case($(1), e -> {
                        if (controle.aumentarVolume()) {
                            System.out.println("Volume da televisão aumentado.");
                        } else {
                            System.out.println("Televisão está no volume máximo.");
                        }
                        return null;
                    }),
                    Case($(2), e -> {
                        if (controle.diminuirVolume()) {
                            System.out.println("Volume da televisão diminuido. ");
                        } else {
                            System.out.println("Televisão está no volume mínimo.");
                        }
                        return null;
                    }),
                    Case($(3), e -> {
                        System.out.println("Digite o canal: ");
                        final var canal = scanner.nextInt();
                        controle.trocarCanal(canal);
                        return null;
                    }),
                    Case($(4), e -> {
                        controle.proximoCanal();

                        return null;
                    }),
                    Case($(5), e -> {
                        if (!controle.canalAnterior()) {
                            System.out.println("Não é possível voltar a um canal negativo.");
                        }
                        return null;
                    }),
                    Case($(6), e -> {
                        System.out.println("Estado da televisão: " + controle.pegarInformacoes());
                        return null;
                    }),
                    Case($(7), e -> {
                        System.out.println("Desligando a televisão e saindo...");

                        System.exit(0);
                        return null;
                    }),
                    Case($(), e -> {
                        System.out.println("Opção inválida, tente novamente.");
                        return null;
                    })
            );

            System.out.println("Estado da televisão: " + controle.pegarInformacoes());
        }

    }
}
