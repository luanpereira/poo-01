package br.uema.poo;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistanciaDoisPontos {
    private Map<String, List<Double>> n;

    public DistanciaDoisPontos(Double x1, Double y1, Double x2, Double y2) {
        n = new HashMap<>();
        n.put("p1", Arrays.asList(x1, y1));
        n.put("p2", Arrays.asList(x2, y2));
    }

    public Double calcular() {
        return new BigDecimal(Math.sqrt(
                new BigDecimal(
                        Math.pow(
                                new BigDecimal(n.get("p2").get(0))
                                        .subtract(new BigDecimal(n.get("p1").get(0))).doubleValue()
                                , 2))
                        .add(
                                new BigDecimal(
                                        Math.pow(
                                                new BigDecimal(n.get("p2").get(1))
                                                        .subtract(new BigDecimal(n.get("p1").get(1))).doubleValue()
                                                , 2))
                        ).doubleValue()
        )).doubleValue();
    }
}
