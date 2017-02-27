public class Solution {
    public int firstUniqChar(String s) {
	     Map<Character, Integer>map=new HashMap<>();	     
	     for(int i=0;i<s.length();i++)
	     {
	    	 if(map.containsKey(s.charAt(i)))
	    		 map.replace(s.charAt(i), 0);//如果有重复，直接置为0
	    	 else
	    	 map.put(s.charAt(i), 1);
	     }
	     for(int i=0;i<s.length();i++)//扫描无重复的map即可
	     {
	    	 if(map.get(s.charAt(i))==1)
	    		 return i;
	     }
	     return -1;
	    }
}