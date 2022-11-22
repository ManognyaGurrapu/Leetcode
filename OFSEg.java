/* [3,4,5,2]: 
 * output=12
 * max product of elements -1
 */

import java.util.*;
public class OFSEg {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] str1=str.split(" ");
        int [] arr=new int[str1.length];
        for(int i=0;i<str1.length;i++){
            arr[i]=Integer.parseInt(str1[i]);
        }
        List <Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                al.add((arr[i]-1)*(arr[j]-1));
            }
        }
        int m=al.indexOf(0);
        for(int i=0;i<al.size();i++){
            if(al.get(i)>m){
                m=al.get(i);
            }
        }
        System.out.println(m);
    }
}
