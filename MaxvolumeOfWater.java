/*Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49. */

import java.util.*;
public class MaxvolumeOfWater {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int [] arr2=new int[2];
        int j=0;
        int max=height[0];
        for(int i=1;i<n;i++){
            if(height[i]>=max){
                max=height[i];
                arr2[j]=i;
                j++;
            }
        }
        int [] heights=new int[height.length];
        for(int i=0;i<height.length;i++){
            heights[i]=height[i];
        }
        Arrays.sort(height);
        int smax=0;
        for(int i=height.length-2;i>=0;i--){
            if(height[i]!=height[height.length-1]){
                smax=height[i];
            }
        }
        for(int i=0;i<heights.length;i++){
            if(heights[i]==smax){
                arr2[j]=i;
            }
        }
        System.out.println(Math.abs(arr2[arr2.length-1]-arr2[arr2[0]])*Math.min(arr2[arr2.length-1],arr2[0]));
    }
}
