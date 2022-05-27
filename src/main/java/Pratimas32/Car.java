package Pratimas32;

public class Car {

    private String model;
    private double height;
    private double weight;
    private int year;

    public Car(String model, double height, double weight, int year) {
        this.model = model;
        this.height = height;
        this.weight = weight;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}
