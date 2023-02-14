public class MergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] sol=new int[n+m];
            int i=0,j=0,k=0;
            while(i<m&&j<n){
                if(nums1[i]<nums2[j]){
                    sol[k]=nums1[i];
                    i++;
                    k++;
                }else{
                    sol[k]=nums2[j];
                    j++;
                    k++;
                }
            }
            while(i<m){
                sol[k]=nums1[i];
                i++;
                k++;
            }
            while(j<n){
                sol[k]=nums2[j];
                j++;
                k++;
            }
            for(int l=0; l<n+m;l++){
                System.out.print(sol[l]+" ");
            }
        }
    }
