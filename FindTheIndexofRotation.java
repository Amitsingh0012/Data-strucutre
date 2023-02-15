
import java.util.*;

public class FindTheIndexofRotation {
    static int isRotated(int[] arr){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid+1]){
                ans=mid;
                break;
            }else if(arr[mid]<arr[mid-1]){
                ans=mid-1;
                break;
            }else if(arr[low]<=arr[mid]){
                low=mid+1;
            }else if(arr[mid]<=arr[high]){
                high =mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(isRotated(arr));
    }
}