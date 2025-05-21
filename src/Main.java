//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int x = 10;

        if (x >= 10){
            System.out.println("a");
        }else if (x >= 5){
            System.out.println("b");
        }else if (x < 5){
            System.out.println("c");
        }else{
            System.out.println("d");
        }

    }
}