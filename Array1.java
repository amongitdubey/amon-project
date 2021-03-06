import java.util.Scanner;
import java.io.*;
public class Array1{//class
public static void main(String[] args)  {//main
                 Scanner sn = new Scanner(System.in);
int dd,mm,yy;
System.out.print("DAY ::::");
dd=sn.nextInt();
System.out.print("Month :::");
mm=sn.nextInt();
System.out.print("Yeas ::::");
yy=sn.nextInt();
System.out.println("**********************************************************************");
int mday[]={31,28,31,30,31,30,31,31,30,31,30,31,0};
if (yy%4==0){
mday[2]=29;}
else 
{mday[2]=28;}
int sum=0,i;
for( i=1;i<=mm-1;i++);
{  sum=sum+mday[i];}
sum=sum+dd;
System.out.println("Total =="+sum);
}//main
}//class