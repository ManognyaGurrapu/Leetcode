/*Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.
Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330" */

import java.util.*;
public class LargestNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List <Integer> ar1=new ArrayList<>();
        StringBuilder res=new StringBuilder();
        //Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                ar1.add(arr[i]%10);
                arr[i]/=10;
            }
        }
        Collections.sort(ar1);
        for(int i=ar1.size()-1;i>=0;i--){
        res.append(ar1.get(i));
    }
    System.out.println(res);
}
}
