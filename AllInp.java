import java.util.Scanner;

public class AllInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input username
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("your age is: "+ age);

        // Double input
        System.out.println("please enter your salary: ");
        double salary = sc.nextDouble();
        System.out.println("Your entered salary is " + salary);

        // string input
        System.out.println("Please enter a quote: ");
        String quote = sc.next();
        System.out.println("Your entered quote is: "+ quote);

        // boolean input
        System.out.println("Enter a boolean(True or false) : ");
        boolean bool = sc.nextBoolean();
        System.out.println("your entered boolean is: "+ bool);


    }
}
