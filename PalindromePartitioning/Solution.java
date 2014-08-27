public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        
        if(s==null) return null;
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<String>();
        getPalindromeStrs(s,res,temp,0);
        return res;
        
    }
    
    public void getPalindromeStrs(String s, ArrayList<ArrayList<String>> res, ArrayList<String> temp, int start){
        if(start == s.length()){
            res.add(new ArrayList<String>(temp));
            temp = new ArrayList<String>();
            return;
            
        }
        for(int i=start+1;i<=s.length();i++){
            
            String substr = s.substring(start,i);
            if(isPalindrome(substr)){
                
                temp.add(substr);
                getPalindromeStrs(s,res,temp,i);
                temp.remove(temp.size()-1);
                
            }
            
        }
        
        
    }
    
    private boolean isPalindrome(String str) {
    	int left = 0;
    	int right = str.length() - 1;
     
    	while (left < right) {
    		if (str.charAt(left) != str.charAt(right)) {
    			return false;
    		}
     
    		left++;
    		right--;
    	}
     
    	return true;
}
    
}
