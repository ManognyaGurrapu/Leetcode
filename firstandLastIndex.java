/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1] */

import java.util.*;
public class firstandLastIndex {
    static int First(int arr[],int target){
        int l=0;
        int h=arr.length-1;
        int result=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(target==arr[mid] ){
                result=mid;
            }
            if(target<=arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
    static int last(int [] arr,int target){
       int l=0;
       int h=arr.length-1;
       int result=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(target==arr[mid]){
                result=mid;
            }
            if(arr[mid]<=target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
    return result;
}
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int []res=new int[2];
        res[0]=First(arr, target);
        res[1]=last(arr, target);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" "); 
        }
}
    }

