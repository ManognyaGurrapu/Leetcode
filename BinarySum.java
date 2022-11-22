/*Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101" */

import java.util.*;
//import java.lang.*;
public class BinarySum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String st1=sc.next();
        String st2=sc.next();
        int k=st1.length();
        int num1=0;
        for(int i=0;i<st1.length();i++){
            num1=(int) (num1+((st1.charAt(i)-'0')*(Math.pow(2,k-1))));
            k--;
        }
        int l=st2.length();
        int num2=0;
        for(int i=0;i<st2.length();i++){
            num2=(int) (num2+((st2.charAt(i)-'0')*(Math.pow(2,l-1))));
            l--;
        }
        int res=num1+num2;
        StringBuilder result=new StringBuilder();
        while(res>0){
            result.append(res%2);
            res=res/2;
        }
        /*StringBuilder last=new StringBuilder();
        last.append(result);
        last.reverse();*/
        System.out.println(result.reverse());
    }
}
