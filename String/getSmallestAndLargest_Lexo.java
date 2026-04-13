import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Initialize with first substring
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Loop through all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            // Compare for smallest
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            // Compare for largest
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;

}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
