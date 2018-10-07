package br.uema.poo;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaiorMenor {
    private List<Double> n;

    public MaiorMenor(Double a, Double b) {
        n = Arrays.asList(a, b);
    }

    public MaiorMenor(Double a, Double b, Double c) {
        n = Arrays.asList(a, b, c);

    }

    public Double maior(){
        return n.stream()
                .mapToDouble(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
    }

    public Double menor(){
        return n.stream()
                .mapToDouble(v -> v)
                .min().orElseThrow(NoSuchElementException::new);
    }

    public Double diferencaMaiorMenor(){
        return new BigDecimal(maior())
                .subtract(new BigDecimal(menor()))
                .doubleValue();
    }
}
