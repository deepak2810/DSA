import java.util.Scanner;

public class firse {
    public static int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        System.out.println("enter another number: ");
        int b = sc.nextInt();
        System.out.println(mul(a,b));

    }
}
