/*Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]] */


import java.util.*;
public class Subsets {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] str1=str.split(" ");
        int [] arr=new int[str1.length];
        for(int i=0;i<str1.length;i++){
            arr[i]=Integer.parseInt(str1[i]);
        }
        
    }
}
