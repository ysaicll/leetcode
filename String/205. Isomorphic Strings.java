public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==0||s.length()==1)
        	return true;
        Map<Character, Character> map = new HashMap<Character, Character>();  
        Set<Character> set = new HashSet<Character>();  //set是无序的，且不允许重复
          
        for(int i=0; i<s.length(); i++) {  
            char c1 = s.charAt(i);  
            char c2 = t.charAt(i);  
              
            if(map.containsKey(c1))     //c1有映射值
            {  
                if(map.get(c1) != c2)  //但是c1的映射值不是c2，说明不对应
                return false;  
            } 
            else 
            {  
                if(set.contains(c2)) //c2已经存到set里面了，但是map中又没有映射c2，说明不对应
                return false;  
              
                else 
                {  
                    map.put(c1, c2); //map中有映射，set中就有元素 
                    set.add(c2);  
                }  
            }  
        }  
        return true;  
    }
}