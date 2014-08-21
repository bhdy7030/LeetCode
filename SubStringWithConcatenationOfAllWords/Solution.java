public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
        if(L==null||L.length==0) return null;
        int n = L.length;
        int m = L[0].length();
        int l = S.length();
        
        List<Integer> ret = new ArrayList<Integer>();
        Map<String,Integer> dict = new HashMap<String,Integer>();
        for(String s:L){
            if(dict.containsKey(s)){
                dict.put(s,dict.get(s)+1);
            }
            else{
                dict.put(s,1);
            }
            
            
        }
        
        int i=0;
        while(i<=l-n*m){
            
            Map<String,Integer> temp = new HashMap<String,Integer>(dict);
            
            for(int j=0;j<n;j++){
                
                String s = S.substring(i+j*m,i+(j+1)*m);
                if(temp.containsKey(s)){
                    
                    if(temp.get(s)==1){
                        temp.remove(s);
                    }
                    else{
                        temp.put(s,temp.get(s)-1);
                    }
                
                }
                else{
                    break;
                }
                
            }
            
            if(temp.size()==0){
             ret.add(i);   
            }
            
            
            
            i++;
        }
        
        
        return ret;
    }
}
