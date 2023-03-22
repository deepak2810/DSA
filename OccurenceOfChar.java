import java.util.Scanner;

public class OccurenceOfChar {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String str = scan.nextLine();

        char ch = scan.next().charAt(0);
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;

            }
        }


        System.out.println(count);


    }
}
