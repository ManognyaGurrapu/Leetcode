import java.util.*;
public class KokoEatingBananas {
    static int find(int [] arr, int h){
        int left=1;
        int right=1000000;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(canEatInTime(arr,mid,h)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            
        }
        return left;
    }
    static boolean canEatInTime(int [] arr,int k,int h){
        int hr=0;
        for(int p:arr){
            int div=p/k;
            hr+=div;
            if(p%k!=0){
                hr++;
            }
        }
        return hr<=h;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int h=sc.nextInt();
        System.out.println(find(arr,h));
    }
}
