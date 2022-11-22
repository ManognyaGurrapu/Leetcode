/*Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807. */

import java.util.*;
public class AddingTwoNumbers {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        List <Integer> arr1=new ArrayList<>();
        List <Integer> arr2=new ArrayList<>();
        for(int i=0;i<3;i++){
            arr1.add(sc.nextInt());
        }
        for(int i=0;i<3;i++){
            arr2.add(sc.nextInt());
        }
        int [] result=new int[arr1.size()];
        for(int i=0;i<=arr1.size()-1;i++){
            int res=0;
            res=result[i]+arr1.get(i)+arr2.get(i);
            if(res<=9){
                result[i]=res;
            }
            else if(res>9){
                int rem=res%10;
                res=res/10;
                result[i]=rem;
                result[i+1]=res;
            }
        }
        for(int i=result.length-1;i>=0;i--){
            System.out.print(result[i]);
        }
    }
}
