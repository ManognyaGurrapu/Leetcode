import java.util.*;
class Solution {
    static void addBinary(String a, String b) {
        int [] arres1=new int[a.length()];
        int [] arres2=new int[b.length()];
        for(int i=0;i<a.length();i++){
            arres1[i]=Integer.parseInt(b, a.charAt(i));}
        for(int j=0;j<b.length();j++){
            arres2[j]=Integer.parseInt(b, b.charAt(j));
        }
        System.out.println(arres1[0]);
        System.out.println(arres2[0]);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        addBinary(a,b);
    }
}