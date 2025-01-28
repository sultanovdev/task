package md;

import java.util.Objects;

public class Car {
    private String color;
    private String model;

    //construktors


    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public Car() {
    }

    //getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }

    //method
    void transmissionType(String name){
        if(name == "Avtomat karobka"){
            System.out.println("Avtomobil uzatishlar qutisi avtomat karokba bilan jihozlangan");
        }else {
            System.out.println("Avtomobil uzatishlar qutisi mexanik karokba bilan jihozlangan");

        }
    }
}
