/*Given a string s which represents an expression, evaluate this expression and return its value. 

The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

Example 1:

Input: s = "3+2*2"
Output: 7
Example 2:

Input: s = " 3/2 "
Output: 1
Example 3:

Input: s = " 3+5 / 2 "
Output: 5 */


import java.util.*;
public class Calculation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int num=0;
        char c='*';
        Stack <Integer> sto=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(i)){
                num=num*10+(str.charAt(i)-'0');
            }
            if(!Character.isDigit(i) || str.charAt(i)==' '){
                if(c=='+'){
                    sto.push(num);
                }
                if(c=='*'){
                    sto.push(sto.pop()*num);
                }
                if(c=='-'){
                    sto.push(-num);
                }
                if(c=='/'){
                    sto.push(sto.pop()/num);
                }
                c=str.charAt(i);
                num=0;
            }
        }
    }
}
