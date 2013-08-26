public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
		if(A.length<=1) return A.length;
		int length= A.length;
		int i=0;
		int j=1;
		
		while(j<length){
			
			if(A[i]!=A[j]){
				i++;
				j++;
				
			}
			else {
				int m=j;
				int n=j+1;
				while(n<A.length){
					A[m++]=A[n++];
				}
				length--;
				
			}
					
			
		}
	
	
	
	
		return length;
		
		
    }
}
