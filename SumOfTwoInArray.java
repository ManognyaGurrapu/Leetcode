/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2]. */

import java.util.*;
public class SumOfTwoInArray {
    static int[] send(int [] arr,int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[l]+arr[mid]==target){
                return new int[]{l,mid};
            }
            else if(arr[l]+arr[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return new int[]{};
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int [] res=new int[2];
        res=send(arr,target);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
