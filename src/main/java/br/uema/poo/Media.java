package br.uema.poo;

import java.math.BigDecimal;

public class Media {
    private Double a;
    private Double b;
    private Double c;

    public Media(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double calcular(){
        return new BigDecimal(a).add(new BigDecimal(b)).add(new BigDecimal(c)).divide(new BigDecimal(3)).doubleValue();
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

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
