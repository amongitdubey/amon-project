import java.util.Scanner;
import java.io.*;
    public class Lab7_2 {//class
     public static void main(String[] args) throws IOException {//main
      Scanner reader  = new Scanner(System.in);
        int number;
    do {
            System.out.print("Enter odd number to exit loop: ");
            number = reader.nextInt();

            if (number % 2 == 0) {
                System.out.println("You Entered " + number + ", it's even.");
            } else {
                System.out.println("You Entered " + number + ", it's odd.");
            }

        } while (number % 2 == 0);

                System.out.println("Exited loop.");

    }
}