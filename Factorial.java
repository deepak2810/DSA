import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        int fact = 1;
        for(int i = 1; i<= num; i++){
            fact *= i;
        }

        System.out.println("Factorial of the number is "+ fact);
    }
}
