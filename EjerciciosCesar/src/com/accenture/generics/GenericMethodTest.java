package com.accenture.generics;

public class GenericMethodTest {

    //RETORNA UN VALOR BOOLEAN
    public static <T> boolean isEqual (GenericType<T> g1, GenericType<T> g2){
        return g1.get().equals(g2.get());
    }

    public static void main(String[] args) {

        //CREACIÓN DE INSTANCIAS A PARTIR DE LA CLASE GenericType CREADA PREVIAMENTE
        GenericType<String> g1 = new GenericType<String>();
        GenericType<String> g2 = new GenericType<String>();

        g1.set("centurion");
        g2.set("centurion");

        //FORMA USUAL DE LLAMADO AL MÉTODO GENÉRICO
        boolean isEqual = GenericMethodTest.<String>isEqual(g1,g2);
        System.out.println("isEquals(g1,g2) 1 of 2 "+ isEqual);

        //SEGUNDA OPCIÓN DE LLAMADO AL MÉTODO GENÉRICO
        isEqual = GenericMethodTest.isEqual(g1,g2);
        System.out.println("isEquals(g1,g2) 1 of 2 "+ isEqual);

    }
}
