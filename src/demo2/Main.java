package demo2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.color = "pink";
        c1.year = 2024;
        c1.run();
        c1.run(80);

        SportCar sc1= new SportCar();
        sc1.run();
        sc1.speedUp();
        sc1.brand = "Mercedes";
        sc1.color = "blue";
        sc1.year = 2021;
        sc1.nitro = "N2";

        F1SportCar f1 = (F1SportCar)c1;// down casting
        Car c2 = (Car) sc1;// up casting


    }
}
