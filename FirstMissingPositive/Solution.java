public class Solution {
    public int firstMissingPositive(int[] A) {
        if(A==null||A.length==0) return 1;
        int L = A.length;
        int i=0;
        while(i<L){
            
            if(A[i]>0&&A[i]<=L&&A[A[i]-1]!=A[i]&& A[i]!=i+1){
                int temp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = temp;
               
            }
            else{
                i++;
            }
            
        }
        
         for (i = 0; i < L; i++) {
            if (A[i] != i + 1)
                return i + 1;
        }
        return L + 1;
        
        
        
      
    }
}