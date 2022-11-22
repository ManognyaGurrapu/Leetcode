import org.omg.CORBA.BooleanHolder;
import java.util.*;
public class HappyNumber2 {
    static boolean evaluation(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=(rem*rem);
            num=num/10;
        }
        while(sum!=1){
            evaluation(sum);
        }
        if(sum==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean result=evaluation(num);
        System.out.println(result);
    }
}
