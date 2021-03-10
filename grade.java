import java.util.Scanner;
 
public class grade {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        System.out.print(" Input total score : ");
        int Score = scan.nextInt();
        
        if(Score >= 80){//open-if
            System.out.print("Good");
        }//End-if
        else if(Score >= 50 && Score < 80){//open-if
            System.out.print("normal");
        }//end-if
        else if(Score < 50){//open-if
            System.out.print("fail");
        }//end-if
        scan.close();
    }//main
}//class