package com.company.kurs.hashcode;


public class Main {
    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Jan", "Kowalski");
        Pracownik p2 = new Pracownik("Jan", "Kowalski");

        // == prownuja referencje obiektow
        System.out.println(p1 == p2); // zazwsze false

        // equals
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}
