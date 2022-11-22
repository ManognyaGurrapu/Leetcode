/* 332225551==>> 23323511 */

import java.util.*;
public class CountandSay {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //int [] arr=new int[str.length()];
        /*for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }*/
        int ct=1;
        String res="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                ct++;
            }
            else{
                res+=ct;
                res+=str.charAt(i);
                ct=1;
            }
        }
      
            if(str.charAt(str.length()-1)!=str.charAt(str.length()-2)){
                res+='1';
                res+=str.charAt(str.length()-1);
            }
            else{
                res+=ct;
                res+=str.charAt(str.length()-1);
            }
            System.out.println(res);
        }
        
    }

