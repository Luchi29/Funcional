package com.example.funcional;

import java.util.Scanner;

import static java.lang.System.out;

public class StringReverse {

        public static String reverse(String palabra) {
            if (palabra.length() <= 1) {
                return palabra;
            } else {
                return reverse(palabra.substring(1)) + palabra.charAt(0);
            }
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.println("Seleccione una palabra para invertir: ");
        String palabra = in.nextLine();
        out.println(reverse(palabra));
    }
}
