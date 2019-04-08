package com.dangerousplay.lasalle.oop.exercise2.elevador;


import com.dangerousplay.lasalle.oop.exercise2.elevador.models.Elevador;

import java.util.Scanner;

import static io.vavr.API.*;

/**
 * 2. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
 * A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
 * capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes
 * métodos:
 * Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
 * Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
 * Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
 * Sobe: para subir um andar (não deve subir se já estiver no último andar);
 * Desce: para descer um andar (não deve descer se já estiver no térreo);
 * Encapsular todos os atributos da classe (criar os métodos set e get).
 **/
public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Infome a capacidade do elevador: ");
        final var capacidade = scanner.nextInt();

        System.out.print("Infome o total de andares no prédio: ");
        final var totalAndares = scanner.nextInt();

        final var elevador = new Elevador(capacidade, totalAndares);

        while(true){
            System.out.println();
            System.out.println();
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Entrar no elevador.");
            System.out.println("2 - Sair do elevador.");
            System.out.println("3 - Subir um andar.");
            System.out.println("4 - Descer um andar.");
            System.out.println("5 - Estado do elevador.");

            final var opcao = scanner.nextInt();

            Match(opcao).of(
                    Case($(1), e -> {
                        if(elevador.entra()){
                            System.out.println("Uma pessoa entrou no elevador, total de pessoas no elevador: " + elevador.getPessoas());
                        } else {
                            System.out.println("O elevador está em sua carga máxima: " + elevador.getPessoas());
                        }
                        return null;
                    }),
                    Case($(2), e -> {
                        if(elevador.sai()){
                            System.out.println("Uma pessoa saiu do elevador, total de pessoas no elevador: " + elevador.getPessoas());
                        } else {
                            System.out.println("Não há ninguém no elevador.");
                        }

                        return null;
                    }),
                    Case($(3), e -> {
                        if(elevador.sobe()){
                            System.out.println("Elevador subindo para o andar: " + elevador.getAndarAtual());
                        } else {
                            System.out.println("O elevador está no último andar: " + elevador.getAndarAtual());
                        }
                        return null;
                    }),
                    Case($(4), e -> {

                        if(elevador.desce()){
                            System.out.println("Elevador desceu um andar: " + elevador.getAndarAtual());
                        } else {
                            System.out.println("Elevador já está no terreo: " + elevador.getAndarAtual());
                        }

                        return null;
                    }),
                    Case($(5), e -> {
                        System.out.println(elevador.toString());
                        return null;
                    }),
                    Case($(), e -> {
                        System.out.println("Opção inválida, tente novamente. ");
                        return null;
                    })
            );
        }
    }
}
