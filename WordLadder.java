
/**
Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the dictionary
For example,

Given:
start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]

Return

  [
    ["hit","hot","dot","dog","cog"],
    ["hit","hot","lot","log","cog"]
  ]
Note:

All words have the same length.
All words contain only lowercase alphabetic characters.

**/

public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(!dict.contains(end)||start.equals(end)) return 0;
		
		HashMap<String,Integer> steps = new HashMap();
		Queue<String> q = new LinkedList<String>();
		HashSet<String> visited = new HashSet<String>();
		q.offer(start);
		visited.add(start);
		steps.put(start,1);
		
		while(!q.isEmpty()){
				
				String st = q.remove();
				
					
					for(int i=0;i<st.length();i++){
						for(int j=0;j<26;j++){
							StringBuilder str = new StringBuilder(st);
							str.setCharAt(i,(char)('a'+j));
							String s = str.toString();
							
							if(s.equals(end)){
								
								return steps.get(st)+1;
								
							}
							
							
							if(!visited.contains(s)&&dict.contains(s)){
								q.offer(s);
								visited.add(s);
								
								steps.put(s,steps.get(st)+1);
							}
							
						}//end of inner for loop	
					} //end of outer for loop
					
					
				
				
				
		
		
		}
		
		return 0;
		
    }
}

