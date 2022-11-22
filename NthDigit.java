/*Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
Example 1:

Input: n = 3
Output: 3
Example 2:

Input: n = 11
Output: 0
Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10. */

import java.util.*;
public class NthDigit {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        int j=0;
        String str="";
        for(int i=1;i<=n;i++){
            /*if(i%10==0){
                //arr[j]=i/10;
                //arr[j+1]=i%10;
                //j++;
                arr[j]=i;
            }
            else{
                arr[j]=i/10;
                arr[j+1]=i%10;
                j++;
            }*/
            str+=i;
        }
        /*for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/
        System.out.println(str.charAt(n-1));
        
    }
}
