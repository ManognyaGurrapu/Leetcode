/*Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores). */

import java.util.*;
public class DuplicatesInArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] str1=str.split(" ");
        int [] arr=new int[str1.length];
        for(int i=0;i<str1.length;i++){
            arr[i]=Integer.parseInt(str1[i]);
        }
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[count]=arr[i+1];
                count++;
            }
        }
        System.out.println(count);
    }
}
