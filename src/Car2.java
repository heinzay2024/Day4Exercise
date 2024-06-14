public class Car2 extends Vehicle {
    private int numberOfDoors;

    public  Car2(int noOfDoors, String brand, int year){
        super(brand,year);
        this.numberOfDoors = noOfDoors;
    }

    public void openTrunk(){
        System.out.println("Open Trunked!");
    }

    public int getNoOfDoors(){
        return numberOfDoors;
    }
}
