/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false */

import java.util.*;
public class ValidAnagram {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char []a1=s1.toCharArray();
        char [] a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i=0,j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]!=a2[j]){
                System.out.println("false");
                break;
            }
            else{
                i++;
                j++;
            }
        }
        if(i==a1.length && j==a2.length){
            System.out.println("Ture");
        }
    }
}
