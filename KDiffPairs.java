/* arr=[1,2,3,4,5] k=1
output =4
as (1,2) (2,3)(3,4)(4,5) are pairs who diff is 1
 */

import java.util.*;
public class KDiffPairs {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count=0;
        int i=0;
        while(i<arr.length){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i]-arr[j])==k){
                    count++;
               }
            }
            i++;
        }
        System.out.println(count);
    }
}
