import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        // Step 1: Convert to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        
        if (a.length() != b.length()) {
            return false;
        }

        // Step 3: Convert to char arrays
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        // Step 4: Sort both arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        // Step 5: Compare arrays
        return java.util.Arrays.equals(arr1, arr2);
    }

   
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
