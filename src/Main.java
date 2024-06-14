public class Main {
    public static void main(String[] args) {

        //Abstraction Sample Start
        toyota toyo=new toyota();
        toyo.Run();
        toyo.Energy();

        BMW bmw = new BMW();
        bmw.Run();
        bmw.Energy();
        //Abstraction Sample

        //Encapsulation Sample Start
        BankAccount bankcard = new BankAccount(500000 , "1039-1121-2998-7586");
        bankcard.deposit(40000);
        bankcard.widthdraw(3000);

        System.out.println(bankcard.getBalance());
        System.out.println(bankcard.getAccountNumber());
        //Encapsulation Sample End

        //Inheritance
        Car2 car=new Car2(4,"Toyota",2020);
        car.openTrunk();
        System.out.println("My car has " + car.getNoOfDoors() + "doors ");

        Truck truck = new Truck("Mazada",2000,50);
        truck.loadCargo(200);
        System.out.println("My truck is brand of " + truck.getBrand());
        System.out.println("It can carry "+truck.getLoadCapacity());
        System.out.println("It is an old model , " + truck.getYear());
    }
}