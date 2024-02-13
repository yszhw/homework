package learning;

public class Car extends Vehicle{
    private int loader;

    public Car() {
    }

    public Car(int loader,String brand, String color, double speed, int wheels) {
        super(brand, color, speed, wheels);
        this.loader = loader;
    }

    public void start(){
        System.out.println("Car is started ");
    }
    public void accelerate(double speed){
        System.out.println("Car is accelerating at speed "+speed+" km/h ");
    }
    public void brake(){
        System.out.println("Car is braking ");
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
    public void display(){
        System.out.println("车轮的个数"+getWheels());
        System.out.println("这是一辆小车，能载5人，实载"+getLoader()+"人");
        if(getLoader()>5){
            System.out.println("你超员了");
        }
    }
}
