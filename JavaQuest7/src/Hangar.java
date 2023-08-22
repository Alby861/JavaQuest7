public class Hangar {
    public static void main (String[] args) {
        Car car = new Car("Toyota", 25000);
        Boat boat = new Boat("Mercedes", 3500);

        String carMessage = car.doStuff();
        String boatMessage = boat.doStuff();

        System.out.println(carMessage);
        System.out.println(boatMessage);
    }
}
