import java.util.Scanner;
import java.io.*;
public class Lab6_2{//class
    public static void main(String[] args) throws IOException {
int i=1;
int sum=0;
while (i <= 10)
{
sum=sum+i;
i++;
}
System.out.print("1+2+3+4+5+6+7+8+9+10 = "+sum);
}
}