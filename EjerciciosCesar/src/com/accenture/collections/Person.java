package com.accenture.collections;

import java.util.ArrayList;
import java.util.Collections;

class Persona implements Comparable{
    private String nombre;
    private String dni;

    public Persona(String dni, String nombre){
        this.nombre =   nombre;
        this.dni    =      dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    @Override
    public int compareTo(Object o) {
        return this.dni.compareTo(((Persona)o).getDni());
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("2529", "Pablo");
        Persona p2 = new Persona("2429", "Tyron");
        Persona p3 = new Persona("2108", "Uniqua");
        Persona p4 = new Persona("2798", "Tasha");

        ArrayList<Persona> list = new ArrayList<Persona>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println("Lista sin ordenar:");
        for (Persona persona: list) {
            System.out.println(persona.getDni() + ", " + persona.getNombre() );
        }

        System.out.println("\nLista ordenada:");
        Collections.sort(list);
        for (Persona persona: list) {
            System.out.println(persona.getDni() + ", " + persona.getNombre());
        }
    }
}