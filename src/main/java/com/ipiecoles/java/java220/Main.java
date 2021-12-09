package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {
         Cadre cadre1 = new Cadre("Bon", "Jean", "74100", new LocalDate(), 2500.00, "homme", false, 1.00);
         System.out.println(cadre1);
    }
}
