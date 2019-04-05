package com.dangerousplay.lasalle.oop.exercise2.elevador.models;


/**
 * A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
 * capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes
 * métodos:
 * Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
 * Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
 * Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
 * Sobe: para subir um andar (não deve subir se já estiver no último andar);
 * Desce: para descer um andar (não deve descer se já estiver no térreo);
 * Encapsular todos os atributos da classe (criar os métodos set e get).
 * */
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public Elevador(int capacidade, int totalAndares){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public boolean entra(){
        if(pessoas >= capacidade){
            return false;
        }

        pessoas++;

        return true;
    }

    public boolean sai(){
        if(pessoas > 0){
            pessoas--;
            return true;
        }

        return false;
    }

    public boolean sobe(){
        if(andarAtual >= totalAndares){
            return false;
        }

        andarAtual++;

        return true;
    }

    public boolean desce(){
        if(andarAtual <= 0){
            return false;
        }

        andarAtual--;

        return true;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
}
