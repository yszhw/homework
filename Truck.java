package learning;

public class Truck extends Car{
    private int payload;

    public Truck() {
    }

    public Truck(int payload,int loader,String brand,
                 String color, double speed, int wheels) {
        super(loader,brand,color, speed, wheels);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }
    @Override
    public void display(){
        System.out.println("车轮的个数"+getWheels());
        System.out.println("这是一辆卡车，能载5人，实载"+getLoader()+"人");
        if(getLoader()>3){
            System.out.println("你超员了");
        }
        System.out.println("这是一辆卡车，核载5000kg，你以经装载"+getPayload()+"kg");
        if(getPayload()>5000){
            System.out.println("你超载了");
        }
    }
}
