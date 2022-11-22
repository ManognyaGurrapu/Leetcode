/*Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21 */

import java.util.*;
public class ReverseInteger {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=Integer.toString(num);
       char [] digit=str.toCharArray();
       String res="";
       if(str.charAt(0)=='-'){
        res+='-';
       }
        for(int i=digit.length-1;i>=0;i--){
            if(digit[i]!='0' && digit[i]!='-'){
                res+=digit[i];
            }
        }
        System.out.println(res);
        
    }
}
