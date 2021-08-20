package com.example.funcional;

import java.util.function.BiFunction;

import static java.lang.System.out;

public class Operaciones {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a,  b) -> a + b;

        BiFunction<Integer, Integer, Integer> resta = (a,  b) -> a - b;

        BiFunction<Integer, Integer, Integer> multiplicacion = (a,  b) -> a * b;

        BiFunction<Integer, Integer, Integer> division = (a,  b) -> a / b;

        out.println(sum.apply(1,2));
        out.println(resta.apply(3,2));
        out.println(multiplicacion.apply(4,5));
        out.println(division.apply(4,2));

    }


}
