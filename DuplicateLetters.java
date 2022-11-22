/*Given a string s, remove duplicate letters so that every letter appears once and only once.
You must make sure your result is the smallest in lexicographical order among all possible results.
Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb" */

import java.util.*;
public class DuplicateLetters {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char [] c=str.toCharArray();
        //Arrays.sort(c);
        int i=0;
        int j=i+1;
        StringBuilder st=new StringBuilder();
       while(i<c.length){
        while(j<c.length){
            
        }
       }
        System.out.println(st);
    }
}
