import java.util.Scanner;

public class compareStringOrder {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string (e.g., welcometojava):");
        String s = scan.next();

        System.out.println("Enter the substring length k:");
        int k = scan.nextInt();

        scan.close();

        // Execute the method and print the result
        System.out.println("\n--- Result ---");
        System.out.println(getSmallestAndLargest(s, k));
    }
}