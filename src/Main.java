public class Main {
    public static void main(String[] args){
        //upcasting
        Vehicle car = new Car( "Toyota", 5000);
        Vehicle bike = new Bike("Scott");

        Car car2 = new Car("Fiat");
        car2.refuel();

        Vehicle todaysVehicle;
        todaysVehicle = car;

        todaysVehicle = bike;

        System.out.println("Idag åker jag " + todaysVehicle.getName());


        car.setName("VW");

        System.out.printf("%s kostar %.2f\n", car.getName(), car.price);
        System.out.println(car.getName() + " is " + car.getType());
        System.out.println(car.soundWarning());



        System.out.println(bike.getName() + " is " + bike.getType());
        System.out.println(bike.soundWarning());

    }
}

