package com.example.funcional;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        Paquete p1 = new Paquete(12, "dire1", 2.3, "loc1");
        Paquete p2 = new Paquete(13, "dire2", 2.3, "loc2");
        Paquete p3 = new Paquete(14, "dire3", 3.3, "loc1");
        Paquete p4 = new Paquete(15, "dire4", 1.3, "loc1");


        ArrayList<Paquete> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        Long cantidad = lista.stream().filter(l -> l.getLocalidad().equals("loc1")).count();
        System.out.println(cantidad);

        Double peso = lista.stream().filter(l -> l.getLocalidad().equals("loc1")).mapToDouble(l -> l.getPeso()).sum();
        System.out.println(peso);


        Map<String, Double> pesoCadaLocalidad = lista.stream().collect(Collectors.groupingBy(l -> l.getLocalidad(), Collectors.summingDouble(l -> l.getPeso())));

        for (String localidad : pesoCadaLocalidad.keySet()) {
            System.out.println("Localidad " + localidad + " Peso " + pesoCadaLocalidad.get(localidad));

        }
    }
}

