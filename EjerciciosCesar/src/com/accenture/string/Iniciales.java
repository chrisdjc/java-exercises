package com.accenture.string;

public class Iniciales {
    public static void main(String[] args) {
        String nombre = "CHRISTOPHER DE JESUS CAN CASTILLO";
        String[] myName = nombre.split(" ");

        for (int i = 0; i < myName.length; i++) {
            String s = myName[i];
            System.out.print(s.charAt(0) + " ");
        }
    }
}
