package demo1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Nobita",19,"0938425034");// tạo ra 1 object từ class Student
//        s1.name = "Nobita";
//        s1.age = 19;
//        s1.telephone = "0938425034";

        Student s2 = new Student("Doraemon",20,"0925426033");
//        s2.name = "Doraemon";
//        s2.age = 20;
//        s2.telephone = "0925426033";
//        s2.girlFriend = "Trần Hà Linh"


        s1.run();
        s2.run();

        s1.eat();
        s2.learn();


        Number ss = new Number();
        ss.a = 199;
        ss.kiemTraChanLe();

        Tamgiac tg = new Tamgiac(2,4,6);
        int v = tg.chuVi();
    }
}
