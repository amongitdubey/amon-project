import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {   
        Scanner reader = new Scanner(System.in);

        // call method not have return value
        open ();
        
        System.out.println("10 + 20 = " + sum(10, 20));
    }
    // no parameter method
    public static void open () {
        System.out.println("Music player started.");
    }
    public static int sum (int a, int b) {
        return a + b;
    }
}