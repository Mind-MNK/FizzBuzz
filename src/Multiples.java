public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        int j = 0;//count

        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                j++;
            }
            i++;  // Increment i to check the next number
        }

        // Print the total count of multiples
        System.out.println("The number of multiples of 3 or 5 below 1000 is: " + j);
    }
}
