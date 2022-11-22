/* Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true */

import java.util.*;
public class MatrixSearch {
    static boolean Search(int arr[][], int target){
        int rl=0;
        int rh=arr.length;
        /*int cl=0;
        int ch=arr[0].length;
        while(rl<=rh){
            int mid=(rl+rh)/2;
            boolean res=SearchRow(arr[mid],target);
            /*if(res==false){
                res=SearchRow(arr[mid-1], target);
            }
            else{
                return true;
            }
            if(res==true){
                return true;
            }*/
            //int ar1[]=new int[arr[0].length];
            for(int i=rl;i<rh;i++){
                if(SearchRow(arr[i], target)){
                    return true;
                }
                else{
                    return false;
                }
            }
            return false;
        }
    static boolean SearchRow(int []arr,int target){
        int l=0;
        int h=arr.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(target<arr[mid]){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        System.out.println(Search(arr,target));
    }
}
