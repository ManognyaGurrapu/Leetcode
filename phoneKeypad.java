/* Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"] */

import java.util.*;
public class phoneKeypad {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String [] s=new String[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='2'){
                s[i]="abc";
            }
            if(ch=='3'){
                s[i]="def";
            }
            if(ch=='4'){
                s[i]="ghi";
            }
            if(ch=='5'){
                s[i]="jkl";
            }
            if(ch=='6'){
                s[i]="mno";
            }
            if(ch=='7'){
                s[i]="pqrs";
            }
            if(ch=='8'){
                s[i]="tuv";
            }
            if(ch=='9'){
                s[i]="wxyz";
            }
    }
    /*for(int i=0;i<s.length;i++){
        System.out.println(s[i]);
    }*/
    String [] res=new String[(s[0].length()*s[s.length-1].length())];
    
    
        String string1=s[0];
        String string2=s[1];
        System.out.println(string1);
        System.out.println(string2);
       for(int j=0;j<string1.length();j++){
            for(int k=0;k<string2.length();k++){
                String result="";
               result+=string1.charAt(j);
               result+=string2.charAt(k);
                System.out.println(result);
            }
            }
        }
    }
    /*for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }*/


