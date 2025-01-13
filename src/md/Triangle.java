package md;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    //constructor
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //
    public double premeter(){
        return sideA+sideB+sideC;
    }

    // Uchburchak tomonlarini chiqarish
    public void sout() {
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
    }
}
