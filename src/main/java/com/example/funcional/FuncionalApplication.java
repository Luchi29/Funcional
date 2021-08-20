package com.example.funcional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;

import static java.lang.System.out;

@SpringBootApplication
public class FuncionalApplication {


    public static void main(String[] args) {
        SpringApplication.run(FuncionalApplication.class, args);
        Function<Double, Function<Double, Double>> conversor = a -> b -> a * b;
        Function<Double, Double> conversorMillaKm = conversor.apply(1.609);
        Function<Double, Double> conversorOnzaGr = conversor.apply(28.345);
        Double a1 = 1.0;
        Double b1 = 1.0;


        out.println(conversorMillaKm.apply(a1));
        out.println(conversorOnzaGr.apply(b1));




    }

}
