import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.io.*;
public class PrimitiveNumber {//class
public static void main(String[] args) throws IOException {//main
        
        float floatnumber = ThreadLocalRandom.current().nextInt(); 
        int trnsfloat = (int)floatnumber; 
        System.out.println("======== float -> int ===========");
        System.out.println("floatnumber is"+"\t"+floatnumber);
        System.out.println("trnsfloat   xis"+"\t"+trnsfloat);
        System.out.println("===============================");

            int intnumber = ThreadLocalRandom.current().nextInt(); 
            float trnsint = intnumber;
            System.out.println("======== int -> float ===========");
            System.out.println("intnumber is"+"\t"+intnumber);
            System.out.println("trnsint   is"+"\t"+trnsint);
            System.out.println("===============================");

                double doublenumber = ThreadLocalRandom.current().nextInt();
                float transdouble = (float)doublenumber;
                System.out.println("======== double -> float ===========");
                System.out.println("doublenumber is"+"\t"+doublenumber);
                System.out.println("transdouble  is"+"\t"+transdouble);
                System.out.println("===============================");

                    char textchar = 'b';
                    int transtext = textchar;
                    System.out.println("======== Char -> int ===========");
                    System.out.println("textchar  is"+"\t"+textchar);
                    System.out.println("transtext is"+"\t"+transtext);
                    System.out.println("===============================");
}//main
}//class