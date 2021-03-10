import java.util.Scanner;
import java.io.*;
    public class Lab6_3 {//class
    public static void main(String[] args) throws IOException {//main
    int sum = 0;
    // int 
    for(int i =1; i <= 100; i++){
        if((i % 12) == 0)
        System.out.println(i);
        sum=sum+i;
    }
        System.out.println("Summation is "+sum);
    }
}