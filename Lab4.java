import java.util.Scanner;
 
public class Lab4 {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        System.out.print(" Input total score : ");

        int Score = scan.nextInt();

        boolean  isHandSome = true;

        if((Score >= 80) && isHandSome == true){//open-if
                System.out.print("Good");
        }//End-if

        else if((Score >= 50 && Score < 80) && isHandSome == true){//open-if
            System.out.print("Good");
        }//end-if

        else if((Score < 50) && isHandSome == true){//open-if
            System.out.print("Good");
        }//end-if

        scan.close();
    }//main
}//class