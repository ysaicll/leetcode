public class Solution {
    public int lengthOfLongestSubstring(String s) {
          if (s.length()==0)
			 return 0;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        int max=0;
	        for (int i=0, j=0; i<s.length(); ++i)
	        {
	            if (map.containsKey(s.charAt(i)))
	            {
	                j = Math.max(j,map.get(s.charAt(i))+1);
	            }
	            map.put(s.charAt(i),i);
	            max = Math.max(max,i-j+1);
	        }
	      //  System.out.println(max);
	        return max;
    }
}
维护一个map，和一个指针j，当i不断往后移动，碰到一个map中有的char就看看指针j的位置，返回差值