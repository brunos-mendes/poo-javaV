package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private Double distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private Integer numeroDeVeiculosPermitidos;
    private List<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();

    public void addCarro(Integer velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        if (listaDeVeiculos.size() < numeroDeVeiculosPermitidos) {
            Carro novoCarro = new Carro(velocidade, aceleracao, anguloDeGiro,placa);
            listaDeVeiculos.add(novoCarro);
        }
    }

    public void addMoto(Integer velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        if (listaDeVeiculos.size() < numeroDeVeiculosPermitidos) {
            Motocicleta novaMoto = new Motocicleta(velocidade, aceleracao, anguloDeGiro, placa);
            listaDeVeiculos.add(novaMoto);
        }
    }

    public void deleteVeiculo(Veiculo veiculo) {
        listaDeVeiculos.remove(veiculo);
    }

    public void deleteVeiculoComPlaca(String placa) {
        try {
            listaDeVeiculos.remove(listaDeVeiculos.stream().filter(veiculo -> veiculo.getPlaca().equals(placa)).findFirst());
        } catch (Exception e) {
            System.out.println("Veiculo não encontrado");
        }
    }

    public Veiculo vencedor() {
        Double maiorNota = 0.0;
        int indexMaiorNota = 0;
        for (int i=0; i <this.listaDeVeiculos.size(); i++) {
            Integer velocidade = listaDeVeiculos.get(i).getVelocidade();
            Double aceleracao = listaDeVeiculos.get(i).getAceleracao();
            Double angulo = listaDeVeiculos.get(i).getAnguloDeGiro();
            Double peso = listaDeVeiculos.get(i).getPeso();
            Integer rodas = listaDeVeiculos.get(i).getRodas();

            Double nota = (velocidade * (aceleracao/2)) / (angulo * (peso - rodas * 100));
            if (nota > maiorNota) {
                maiorNota = nota;
                indexMaiorNota = i;
            }
        }
        return listaDeVeiculos.get(indexMaiorNota);
    }
}
