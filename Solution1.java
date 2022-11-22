/* internationalisation
 * valid abbrevation
 */

import java.util.*;
class Solution1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s=sc.next();

        System.out.println(trial(str,s));
    }

    static boolean trial(String str, String s){
        char [] s1=str.toCharArray();
        char [] s2=s.toCharArray();
        int i=0,j=0;
        while(i<s1.length && j<s2.length){
            if(Character.isDigit(s2[j])){
                int num=0;
                while(j<s2.length && Character.isDigit(s2[j])){
                    num=num*10+(s2[j]-'0');
                    j++;
                }
                i+=num;
            }
            else{
                if(s1[i]!=s2[j]){
                    return false;
                }
                i++;
                j++;
            }
            //return true;
        }
        return (i==s1.length && j==s2.length);
        }
}