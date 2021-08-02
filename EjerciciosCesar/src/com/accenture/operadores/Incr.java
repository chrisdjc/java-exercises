package com.accenture.operadores;

class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;

        x *= x; // 7 * 7 = 49
        y *= y; // 2 * 2 = 4
        y *= y; // 4 * 4 = 16
        x -= y; // 49 - 16 = 33
        System.out.println(x);
    }
}
