package com.dangerousplay.lasalle.oop.exercise2.televisao.service;

import com.dangerousplay.lasalle.oop.exercise2.televisao.domain.Televisao;

/**
 * O controle de volume permite:
 * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 * aumentar e diminuir o número do canal em uma unidade trocar para um canal indicado;
 * consultar o valor do volume de som e o canal selecionado.
 */
public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public boolean aumentarVolume(){
        final var volume = televisao.getVolume() + 1;

        if(volume > 100){
            return false;
        } else {
            televisao.setVolume(volume);
            return true;
        }
    }

    public boolean diminuirVolume(){
        final var volume = televisao.getVolume() - 1;

        if(volume < 0){
            return false;
        } else {
            televisao.setVolume(volume);
            return true;
        }
    }

    public void trocarCanal(int canal){
        televisao.setCanal(canal);
    }

    public void proximoCanal(){
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public boolean canalAnterior(){
        if(televisao.getCanal() <= 0){
            return false;
        } else {
            televisao.setCanal(televisao.getCanal() - 1);
            return true;
        }
    }

    public String pegarInformacoes(){
        return televisao.toString();
    }

}
