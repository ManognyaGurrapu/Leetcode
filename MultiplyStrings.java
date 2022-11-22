/* Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088" */

import java.util.*;
public class MultiplyStrings {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
        char [] n1=num1.toCharArray();
        char [] n2=num2.toCharArray();
        int first=0;
        for(int i=0;i<n1.length;i++){
            first=first*10+(n1[i]-'0');
        }
        int second=0;
        for(int i=0;i<n2.length;i++){
            second=second*10+(n2[i]-'0');
        }
        int res=(first*second);
        String result=Integer.toString(res);
        
        System.out.println(result);
    }
}
