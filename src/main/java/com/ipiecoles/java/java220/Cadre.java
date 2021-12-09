package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Cadre extends Employe{

    private Double coefficient = 1d;

    public Cadre() {

    }

    public Cadre(Double coefficient) {
        this.coefficient = coefficient;
    }

    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase() * this.coefficient;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cadre)) return false;
        if (!super.equals(o)) return false;

        Cadre that = (Cadre) o;

        return Double.compare(that.coefficient, coefficient) == 0;
    }

    @Override
    public String toString() {
        return "Cadre{" +
                "coefficient=" + coefficient +
                "} " + super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coefficient);
    }
}
