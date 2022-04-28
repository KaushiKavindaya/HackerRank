/*

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

  A will consist at most 50 lower case english letters.
  
  */
  
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String R = new StringBuilder(A).reverse().toString();
        
        if(A.equals(R)) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
