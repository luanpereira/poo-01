package br.uema.poo;

import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

public class ValorPagamento {
    private Double valor;
    private int condicaoPagamento;

    public ValorPagamento(Double valor, int condicaoPagamento){
        this.valor = valor;
        this.condicaoPagamento = condicaoPagamento;
    }

    public Double calcular() {

        switch (condicaoPagamento){
            case 1:
                return new BigDecimal(valor)
                        .multiply(new BigDecimal(0.8))
                        .doubleValue();

            case 2:
                return new BigDecimal(valor)
                        .multiply(new BigDecimal(0.9))
                        .doubleValue();
            case 3:
                return new BigDecimal(valor)
                        .multiply(BigDecimal.ONE)
                        .doubleValue();
            case 4:
                return new BigDecimal(valor)
                        .multiply(new BigDecimal(1.05))
                        .doubleValue();
            default:
                return null;
        }
    }
}
