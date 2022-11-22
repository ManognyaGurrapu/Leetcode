/*Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.
Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false */

import java.util.*;
public class ValidSquare {
    static boolean send(int n){
        int l=1;
        int h=n/2;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid*mid==n){
                return true;
            }
            if(mid*mid<n){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(send(n));
    }
}
