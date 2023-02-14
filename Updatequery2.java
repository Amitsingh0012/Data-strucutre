import java.io.*;
import java.util.*;
public class Updatequery2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=sc.nextInt();
        int right=sc.nextInt();
        int x=sc.nextInt();
        for(int i=0;i<=left;i++){
            arr[i]+=x;
        }
        for(int i=right;i<arr.length;i++){
            arr[i]+=x;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
