public class Solution {
    public String getPermutation(int n, int k) {
        
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        int pow = 1;
        for(int i=0;i<n;i++){
             num.add(i+1);
             pow = pow*(i+1);
        }
        
        k--;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            pow = pow/(n-i);
            int index = k/pow;
            ret.add(num.get(index));
            k = k%pow;
            
            for(int j = index;j<n-i-1;j++){
                num.set(j,num.get(j+1));
                
            }
            
            
        }
        
        
        String retString = "";

        for (Integer s : ret)
        {
            retString += s.toString();
        }
        
        return retString;
        
        
        
    }
    
  
}
