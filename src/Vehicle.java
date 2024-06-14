public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("Engine Started!");
    }

    public void stopEngine(){
        System.out.println("Engine Stopped!");
    }

    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }
}
