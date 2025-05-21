package demo2;

public class Car {
    String brand;
    int year;
    String color;

    void run(){
        System.out.println("Car is running: 40km/h");
    }
// phải khác nhau về số lượng và kiểu dữ liệu

    void run(float xyz){
        System.out.println("Car is running: "+xyz+" km/h");
    }

    void run(int a, String b){
        System.out.println("Car is running: "+a+ " km/h");
    }

    void run(String a, int b){
        System.out.println("Car is running: "+a+ " km/h");
    }


    void speedUp(){
        System.out.println("Car is speeding...");
    }
}
