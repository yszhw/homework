package learning;

public class Vehicle {
    private String brand;
    private String color;
    private double speed;
    private int wheels;

    public Vehicle() {
    }

    public Vehicle(String brand, String color, double speed, int wheels) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.wheels = wheels;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

}
