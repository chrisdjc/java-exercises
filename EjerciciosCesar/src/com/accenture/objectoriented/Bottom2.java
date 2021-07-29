package com.accenture.objectoriented;

// - - - - - - - - -  CLASE TOP - - - - - - - -
class Top{
    public Top(String s){
        System.out.print("B");
    }

    public Top(){

    }
}

// - - - - - - - - -  CLASE BOTTOM2 - - - - - - - -
public class Bottom2 extends Top{

    public Bottom2(String s){
        super(s);
        System.out.print("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}