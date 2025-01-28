package md;

import java.util.Objects;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    //construktor


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    //getter and setter

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(sideA, triangle.sideA) == 0 && Double.compare(sideB, triangle.sideB) == 0 && Double.compare(sideC, triangle.sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    //methods
     double getArea(){
        return (sideA*sideB)/2 ;
    }

    double getPerimetr(){
        return sideA+sideB+sideC;
    }
}
