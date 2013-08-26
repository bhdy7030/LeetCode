public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length = s.length();
    	if(length==0) return 0;
    	int count =0;
		for(int j=length-1;j>=0;j--){
			
			if(s.charAt(j)==' '){
				if(count!=0) return count;
				else{
					count=0;
					}
			}
			else{
				
				count ++;
			}
		
		}
        
        return count;
    }
}