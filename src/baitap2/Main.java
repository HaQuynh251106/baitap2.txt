package baitap2;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyNumber[] numbers = new MyNumber[4];

        // Nhập 2 số nguyên
        for (int i = 0; i < 2; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int value = sc.nextInt();
            IntegerNumber intNum = new IntegerNumber();
            intNum.value = value; // gán giá trị trực tiếp
            numbers[i] = intNum;
        }

        // Nhập 2 phân số
        for (int i = 2; i < 4; i++) {
            System.out.print("Nhập tử số của phân số thứ " + (i - 1) + ": ");
            int tu = sc.nextInt();
            System.out.print("Nhập mẫu số của phân số thứ " + (i - 1) + ": ");
            int mau = sc.nextInt();
            if (mau == 0) {
                System.out.println("Mẫu số không được bằng 0, gán mẫu số = 1");
                mau = 1;
            }
            Fraction frac = new Fraction();
            frac.numerator = tu;
            frac.denominator = mau;
            numbers[i] = frac;
        }

        // In kết quả các phép toán
        System.out.println("\n== Kết quả các phép toán ==");

        MyNumber sum1 = numbers[0].add(numbers[1]);
        System.out.println(numbers[0] + " + " + numbers[1] + " = " + sum1);

        MyNumber sub1 = numbers[0].subtract(numbers[1]);
        System.out.println(numbers[0] + " - " + numbers[1] + " = " + sub1);

        MyNumber mul1 = numbers[0].multiply(numbers[1]);
        System.out.println(numbers[0] + " * " + numbers[1] + " = " + mul1);

        MyNumber div1 = numbers[0].divide(numbers[1]);
        System.out.println(numbers[0] + " / " + numbers[1] + " = " + div1);

        System.out.println();

        MyNumber sum2 = numbers[2].add(numbers[3]);
        System.out.println(numbers[2] + " + " + numbers[3] + " = " + sum2);

        MyNumber sub2 = numbers[2].subtract(numbers[3]);
        System.out.println(numbers[2] + " - " + numbers[3] + " = " + sub2);

        MyNumber mul2 = numbers[2].multiply(numbers[3]);
        System.out.println(numbers[2] + " * " + numbers[3] + " = " + mul2);

        MyNumber div2 = numbers[2].divide(numbers[3]);
        System.out.println(numbers[2] + " / " + numbers[3] + " = " + div2);
    }
}