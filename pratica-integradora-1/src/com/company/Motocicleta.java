package com.company;

public class Motocicleta extends Veiculo{
    public Motocicleta(Integer velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
        super.setPeso(300.00);
        super.setRodas(2);
    }
}
