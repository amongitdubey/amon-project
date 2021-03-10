import java.util.Scanner;
import java.io.*;
public class Lab5 {//class
    public static void main(String[] args) throws IOException {//main
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Grade::"+"\t");
         char Grade = sc.next().charAt(0);
         switch(Grade){//open switch
            case 'A':
            int score = 80; 
            System.out.println("Number of Grade is "+"\t"+score); 
            break;
            case 'B':
             score = 70; 
             System.out.println("Number of Grade is "+"\t"+score); 
             break;
            case 'C':
             score = 60; 
             System.out.println("Number of Grade is "+"\t"+score);
             break;
            case 'D':
             score = 50; 
             System.out.println("Number of Grade is "+"\t"+score);
             break;
            case 'F':
             score = 40; 
             System.out.println("Number of Grade is "+"\t"+score);
             break;
            case 'E':
            System.out.print("Score is less than 40");
            default:
            System.out.println("Please Enter Grade is: A, B, C, D or E");      
            }//close switch
    }//main
}//class


