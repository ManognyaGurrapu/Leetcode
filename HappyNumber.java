import java.util.*;
class HappyNumber{
    static int happyNumber(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=n;
        while(res!=1){
            res=happyNumber(res);
        }
        if(res==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}