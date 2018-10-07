package br.uema.poo;

import java.math.BigDecimal;

public class EqSegundoGrau {

    private Double a;
    private Double b;
    private Double c;

    public EqSegundoGrau(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcular(){
        Double delta, r1, r2;

        try {

            if(b == 0 && c == 0) return "Equação incompleta";

            delta = new BigDecimal(Math.pow(b, 2))
                    .subtract(new BigDecimal(4)
                            .multiply(new BigDecimal(a))
                            .multiply(new BigDecimal(c)))
                    .doubleValue();

            if(delta < 0) return "Delta: " + delta + ", " + "Raízes complexas";

            r1 = new BigDecimal(-1)
                    .multiply(new BigDecimal(b))
                    .add(new BigDecimal(Math.sqrt(delta)))
                    .divide(new BigDecimal(2)
                            .multiply(new BigDecimal(a)))
                    .doubleValue();

            r2 = new BigDecimal(-1)
                    .multiply(new BigDecimal(b))
                    .subtract(new BigDecimal(Math.sqrt(delta)))
                    .divide(new BigDecimal(2)
                            .multiply(new BigDecimal(a)))
                    .doubleValue();

            return "Delta: " + delta + ", " + "Raízes " + r1 + " e " + r2;

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return null;

    }
}
