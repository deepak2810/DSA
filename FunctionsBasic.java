import java.util.Scanner;

public class FunctionsBasic {

    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int Subtract(int a, int b){
        int Sub = b-a;
        return Sub;
    }

    public static int Multiply(int a, int b){
        int mul = a*b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition is : " + add(a,b));
        System.out.println("Addition is : " + Subtract(a,b));
        System.out.println("Addition is : " + Multiply(a,b));
        System.out.println("Addition is : " + add(a,b));


    }
}
