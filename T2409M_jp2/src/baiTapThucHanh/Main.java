package baiTapThucHanh;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product a = new Product(1, "laptop", "images/laptop.png", 1500, 10, "Powerful gaming laptop");

        a.displayInfor();

        System.out.print("Enter quantity to order: ");
        int orderQty = sc.nextInt();

        if (a.checkAvailability(orderQty)) {
            double total = a.placeOrder(orderQty);
            System.out.println("Order placed successfully!");
            System.out.println("Total cost: $" + total);
        } else {
            System.out.println("Not enough stock to fulfill the order.");
        }

        a.displayInfor();
    }
}
