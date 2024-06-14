public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand,int year,double loadCapacity){
        super(brand,year);
        this.loadCapacity = loadCapacity;
    }

    public void loadCargo(double weight){
        if (weight <= loadCapacity){
            System.out.println("Full Load and Cargo Ok!");
        }else {
            System.out.println("Over Loaded!");
        }
    }

    public double getLoadCapacity(){
        return loadCapacity;
    }
}
