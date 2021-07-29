package com.accenture.operadores;

public class PrePostDemo {
    public static void main(String[] args) {

        //IN THE FOLLOWING PROGRAM, EXPLAIN WHY THE VALUE "6" IS PRINTED TWICE IN A ROW

        int i = 3;
        i++;
        System.out.println(i);      // "4"
        ++i;
        System.out.println(i);      // "5"
        System.out.println(++i);    // "6"   Se imprime dos veces en pantalla porque en esta línea se ejecuta el incremento antes de visualizar valor actual
        System.out.println(i++);    // "6"   Y aquí primero se visualiza en pantalla y luego se ejecuta el incremento
        System.out.println(i);      // "7"

    }
}
