/*

Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA","ATC" and "CTA".

Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.
This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

Sample Input 1

anagram
margana

Sample Output 1:

Anagrams

*/

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         String s1 = a;
        String s2 = b;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())
        {
            int[] arr = new int[256];
            int[] brr = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                arr[(int) s1.charAt(i)] += 1;
                brr[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (arr[i] != brr[i])
                    return false;
            }
            return true;
        }
        else
        {
            return false;
        }
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
