package Task1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Morten", 30);
        Car car = new Car("Nissan", "Altima",2019,"Coupe"  );
        car.setDriver(driver);
        System.out.println(car);
        System.out.println(driver);
        Car car2 = new Car ("Mercedes", "A", 2021, "Sedan");
        car2.setDriver(driver);
        System.out.println(car2);
        System.out.println(driver);
    }
}
