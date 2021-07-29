package com.accenture.operadores;

public class ArithmeticDemo {

    public static void main(String[] args) {

        //CHANGE THE FOLLOWING PROGRAM TO USE COMPOUND ASSIGNMENTS

        int result = 1 + 2;
        System.out.println(result);

        result -= 1; //result = result - 1;
        System.out.println(result);

        result *= 2; //result = result * 2;
        System.out.println(result);

        result /= 2; //result = result / 2;
        System.out.println(result);

        result += 8; //result = result + 8;
        result %= 7; //result = result % 7;
        System.out.println(result);
    }
}
