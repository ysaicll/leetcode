public class Solution {
    public int firstUniqChar(String s) {
	     Map<Character, Integer>map=new HashMap<>();	     
	     for(int i=0;i<s.length();i++)
	     {
	    	 if(map.containsKey(s.charAt(i)))
	    		 map.replace(s.charAt(i), 0);//������ظ���ֱ����Ϊ0
	    	 else
	    	 map.put(s.charAt(i), 1);
	     }
	     for(int i=0;i<s.length();i++)//ɨ�����ظ���map����
	     {
	    	 if(map.get(s.charAt(i))==1)
	    		 return i;
	     }
	     return -1;
	    }
}