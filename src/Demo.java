import java.util.Scanner;

public class Demo {
    public static void main (String[] args) {
        //nhập thông tin sinh viên sau đó in ra thông tin vừa nhập
        String name;
        int age;
        //input thông tin sinh viên
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên sinh viên:");
        name = sc.nextLine();
        System.out.println("Vui lòng nhập tuổi sinh viên:");
        age = sc.nextInt();
        //output thông tin sinh viên
        System.out.println("Sinh viên:" + name + "Tuổi:" +age);
    }
}
