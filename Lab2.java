class Lab2 {
public static int Lab2Variable1 = 1000; //instance variable
public static void main(String[] args) {
System.out.println("Instance variable " +Lab2Variable1);
bark();
}
public static void bark(){
String  localvariable = "Siberianusky"; // local variable
System.out.println("The Dog name ="+"\t"+Lab2Variable1+  " bark");
System.out.println("The Dog name ="+"\t"+localvariable+  " bark");
}
}
