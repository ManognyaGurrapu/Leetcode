import java.lang.Math;
import java.util.*;
class Poweroffour {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n==Math.pow(4,i))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}