import java.io.*;
import java.util.*;

public class GreaterThanMe {
    public static int greaterThanMe(int[] arr ,int me){
        int count=0;
        for (int j : arr) {
            if (j > me) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(greaterThanMe(arr,arr[i])+" ");
        }
    }
}