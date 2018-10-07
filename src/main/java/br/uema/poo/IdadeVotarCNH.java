package br.uema.poo;

import java.math.BigDecimal;

public class IdadeVotarCNH {
    Integer ano;

    public IdadeVotarCNH(Integer ano){
        this.ano = ano;
    }

    public String verificarIdade(){
        Integer idade;
        String str;

        idade = new BigDecimal(2018)
                .subtract(new BigDecimal(ano))
                .intValue();

        str = "Idade de " + idade  + " anos";

        if(idade >= 16)
            str = str + ", Tem Idade Para votar";
        else
            str = str + ", Não Tem Idade Para votar";

        if(idade >= 18 && idade < 80)
            str = str + " e Tem Idade Para dirigir";
        else
            str = str + " e Não Tem Idade Para dirigir";

        return str;
    }
}
