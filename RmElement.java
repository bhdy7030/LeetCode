public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
         if(A==null||A.length==0) return 0;
    	 int length  = A.length;
		 int i=0;
		 while(i<length){
		 
			if(A[i]!=elem){
				i++;
			}
			else{
				for(int j=i;j<length-1;j++){
					A[j] = A[j+1];		
					}
				A[length-1]=elem;
				length--;
			}
			
		 }
		 return length;
		 
    }
}


/**

public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int i=0, j=0;
        while(j<A.length){
            if(A[j]!=elem){
                A[i]=A[j];
                i++; 
            }
            j++;
        }
        return i;
    }
}

**/