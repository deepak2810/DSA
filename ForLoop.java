public class ForLoop {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        // using a loop to iterate over the array.

        for(int i = 0; i<num.length; i++){
            System.out.println("Element at index "+ i + ";"+ num[i]);
        }
    }
}
