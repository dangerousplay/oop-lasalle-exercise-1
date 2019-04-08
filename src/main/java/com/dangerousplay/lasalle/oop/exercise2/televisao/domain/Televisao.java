package com.dangerousplay.lasalle.oop.exercise2.televisao.domain;

/**
 * Criado por Davi Ficanha Henrique em 07/04/2019
 */
public class Televisao {
    private int volume;
    private int canal;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}
