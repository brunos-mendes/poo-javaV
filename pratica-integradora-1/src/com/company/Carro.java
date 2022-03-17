package com.company;

public class Carro extends Veiculo{

    public Carro(Integer velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
        super.setPeso(1000.00);
        super.setRodas(4);
    }
}
