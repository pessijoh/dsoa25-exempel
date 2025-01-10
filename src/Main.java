public class Main {
    public static void main(String[] args){

        Car car = new Car( "Toyota");
        Bike bike = new Bike("Scott");

        System.out.println(car.getName() + " is " + car.getType());
        System.out.println(bike.getName() + " is " + bike.getType());

    }
}

