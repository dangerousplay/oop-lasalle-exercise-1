package com.dangerousplay.lasalle.oop.exercise2.carro.models;

import java.time.LocalDate;
import java.util.Calendar;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometrosRodados;

    public Carro(String marca, String modelo, int ano, double quilometrosRodados) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometrosRodados = quilometrosRodados;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometrosRodados() {
        return quilometrosRodados;
    }

    public void setQuilometrosRodados(double quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }

    public double calcularQuilometragem() {
        return  Math.abs(quilometrosRodados / (LocalDate.now().getYear() - ano));
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", quilometrosRodados=" + quilometrosRodados +
                '}';
    }
}
