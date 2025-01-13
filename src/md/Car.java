package md;

public class Car {
    String color;
    String model;
    double price;
    String transMissionType;

    //ocnstruktor

    public Person(String color, String models, double price, String transMissionType) {
        this.color = color;
        this.model = model ;
        this.price = price;
        this.transMissionType = transMissionType;
    }

    //sout qilish

    public void sout() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Transmission Type: " + transMissionType);
    }
}
