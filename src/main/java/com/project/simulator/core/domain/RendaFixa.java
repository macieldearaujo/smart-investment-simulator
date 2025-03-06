package com.project.simulator.core.domain;

public class RendaFixa {
    private Double valorInicial;
    private Integer anos;
    private Double taxaJurosAnual;

    public RendaFixa() {};

    public RendaFixa(Double valorInicial, Integer anos, Double taxaJurosAnual) {
        this.valorInicial = valorInicial;
        this.anos = anos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public Double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public Integer getAnos() {
        return anos;
    }

    public void setAnos(Integer anos) {
        this.anos = anos;
    }

    public Double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(Double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }
}
