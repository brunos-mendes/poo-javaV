package com.company;

public abstract class Veiculo {
    private Integer velocidade;
    private Double aceleracao;
    private Double anguloDeGiro;
    private String placa;
    private Double peso;
    private Integer rodas;

    public Veiculo(Integer velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPeso() {
        return peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
