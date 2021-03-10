class VariableExample {
public static int instanceInt = 50; //instance variable
public static void main(String[] args) {
System.out.println("Instance variable " +instanceInt);
myMethod();
}
public static void myMethod(){
int localInt = 20; // local variable
System.out.println("Instance variable " +instanceInt);
System.out.println("Local variable " + localInt);
}
}
