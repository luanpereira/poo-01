package br.uema.poo;

import java.math.BigDecimal;

public class Produto {
    private Double a;
    private Double b;

    public Produto(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double calcular(){
        return new BigDecimal(a).multiply(new BigDecimal(b)).doubleValue();
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
}
