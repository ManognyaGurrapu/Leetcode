/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3 */

import java.util.*;
public class DuplicateBinary {
    static int duplicate(int [] arr){
        int l=0;
        int h=arr.length;
        while(l<=h){
            int mid=(l+h)/2;
            for(int m=l;m<mid;m++){
                if(arr[m]==arr[mid]){
                    return arr[mid];
                }
            }
                if(arr[mid]<=arr[l]){
                    h=mid;
                }
                else{
                    l=mid;
                }
            
            /*if(arr[mid-1]==arr[mid] || arr[mid]==arr[mid+1]){
                return arr[mid];
            }*/
            /*if(arr[mid]<=arr[l]){
                h=mid;
            }
            else{
                l=mid;
            }*/
        }
        return -1;
    }
        public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(duplicate(arr));
        
    }
}
