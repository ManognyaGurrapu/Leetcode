/*You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.
Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:

Input: s = "", t = "y"
Output: "y" */

import java.util.*;
public class MissingLetter {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char []ar1=s1.toCharArray();
        char []ar2=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int i=0,j=0;
         while(i<ar1.length && j<ar2.length){

                if(ar1[i]!=ar2[j]){
                    System.out.println(ar2[j]);
                }
                else{
                    i++;
                    j++;
                }
            }
            System.out.println(ar2[j]);
           /*  for(int i=0;i<ar2.length+1;i++){
                for(int j=0;j<ar1.length;j++){
                    if(ar1[i]!=ar2[j]){
                        System.out.println(ar2[i]);
                    }
                    else{
                        break;
                    }
                    i++;
                }
                
            }*/
        }
    }

