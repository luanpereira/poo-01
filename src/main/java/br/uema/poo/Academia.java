package br.uema.poo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Academia {
    private Double altura;
    private Double peso;

    public Academia(Double altura, Double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public String calcula(){
        Double imc;

        imc = new BigDecimal(peso)
                .divide(new BigDecimal(Math.pow(altura, 2)), RoundingMode.HALF_UP)
                .doubleValue();

        String classificacao  = "";

        if(imc < 20)
            classificacao = "Magreza";
        else if(imc >= 20 && imc < 25)
            classificacao = "Normal";
        else if (imc >= 25 && imc < 30)
            classificacao = "Excesso de Peso";
        else if (imc >= 30 && imc < 35)
            classificacao = "Obesidade";
        else if (imc >= 35)
            classificacao = "Brande Obesidade";

        return "IMC: " + imc + ", Classificação: " + classificacao;
    }
}
