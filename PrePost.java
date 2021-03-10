import java.util.Scanner;
import java.io.*;
public class PrePost {//class
    public static void main(String[] args) throws IOException {//main
    int count = 0;
    int i = 20;
    for(count = 0; count <=5 ;++count){
        if(count == 0) {
            System.out.print("Counting is "+count);
            System.out.println("  Value of i is "+i);
        } else if (count > 0 ) {//open-if
            i++;
            System.out.print("Counting is "+count);
            System.out.println("  Value of i is "+i);
        }//end-if    
    }//for
    }
}


