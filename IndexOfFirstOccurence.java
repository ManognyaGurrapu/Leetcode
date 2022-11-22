/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0. */

import java.util.*;
public class IndexOfFirstOccurence {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String haystack=sc.next();
        String needle=sc.next();
        List <Integer> al=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<haystack.length() && j<needle.length()){
                if(haystack.charAt(i)==needle.charAt(j)){
                    al.add(i);
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            
        }
        if(al.size()==0){
            System.out.println("-1");}
        else
        System.out.println(al.get(0));
        /*for(int k=0;k<al.size();k++){
            System.out.println(al.get(k));
        }*/
    }
}
