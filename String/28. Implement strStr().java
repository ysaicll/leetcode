public class Solution {
    public int strStr(String haystack, String needle) {
            int sub_len=needle.length();
            if(sub_len==0||haystack.equals(needle))
	        	return 0;
	        for(int i=0;i<haystack.length()-sub_len;i++)
	        {
	        	if(haystack.substring(i,sub_len+i).equals(needle))
	        		return i;
	        	if(haystack.substring(haystack.length()-sub_len).equals(needle))
	        		return haystack.length()-sub_len;
	        }
	        return -1;
    }
}