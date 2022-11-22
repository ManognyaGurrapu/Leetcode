/* Example 1:
Input: [-10,-5,0,3,7]
Output: 3
Explanation:
For the given array, A[0] = -10, A[1] = -5, A[2] = 0, A[3] = 3, thus the output is 3.
Example 2:
Input: [0,2,5,8,17]
Output: 0
Explanation:
A[0] = 0, thus the output is 0 */

import java.util.*;
public class FixedPoint {
    static int fixed(int [] arr){
        int l=0;
        int h=arr.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid==arr[mid]){
                return mid;
            }
            
            if(arr[l]<=mid-1){
                h=mid-1;
            }
            if(arr[h]>=mid+1){
                l=mid+1;
            }
            /*if(res!=-1){
                return res;
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
        System.out.println(fixed(arr));
    }
}
