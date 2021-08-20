package com.example.funcional;

import java.util.Optional;
import java.util.stream.LongStream;

public class Recursividad {


    public static Optional<Long> factorial(long n){
        if (n <= 0){
            return Optional.empty();
        }
        return  Optional.of(LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b));
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
