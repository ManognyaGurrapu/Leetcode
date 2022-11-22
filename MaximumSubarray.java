/*Given an integer array nums, find the subarray which has the largest sum and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23 */

import java.util.*;
public class MaximumSubarray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []str1=str.split(" ");
        int [] arr=new int[str1.length];
        for(int i=0;i<str1.length;i++){
            arr[i]=Integer.parseInt(str1[i]);
        }
        List <Integer> al=new ArrayList<>();
        int k=0;
        int sum=0;
        while(k<arr.length){
        for(int i=0;i<arr.length-k+1;i++){
            for(int j=0;j<k;j++){
                sum=sum+arr[i+j];
                al.add(sum);
            }
        }
        k++;
    }
    int maximum=al.indexOf(0);
    for(int i=0;i<al.size();i++){
        if(al.get(i)>maximum){
            maximum=al.get(i);
        }
        
    }
    System.out.println(maximum);
}
}
