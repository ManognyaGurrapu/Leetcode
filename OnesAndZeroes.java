/*You are given an array of binary strings strs and two integers m and n.

Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.

A set x is a subset of a set y if all elements of x are also elements of y.
Example 1:

Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
Output: 4
Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
{"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.
Example 2:

Input: strs = ["10","0","1"], m = 1, n = 1
Output: 2
Explanation: The largest subset is {"0", "1"}, so the answer is 2. */

import java.util.*;

import javax.lang.model.util.ElementScanner6;
class OnesAndZeroes{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str[]=new String[num];
        for(int i=0;i<num;i++){
            str[i]=sc.next();
        }
        int m=sc.nextInt();
        int n=sc.nextInt();
        int res=0;
        int [] zeroes=new int[num];
        int [] ones=new int[num];
        for(int i=0;i<num;i++){
            String first=str[i];
            int k=0;
            int zs=0;
            int os=0;
            //int res=0;
            while(k<first.length()){
                if(first.charAt(k)=='0')
                {zs++;
                }
                else if(first.charAt(k)=='1')
                os++;
                else
                System.out.println("Invalid");
            k++;
            }
            zeroes[i]=zs;
            ones[i]=os;
        }
        for(int i=0;i<num;i++){
            if(zeroes[i]<=m && ones[i]<=n){
                res++;
            }
        }
        System.out.println(res);
    }
}