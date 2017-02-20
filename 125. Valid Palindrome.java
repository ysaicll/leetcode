public class Solution {
    public boolean isPalindrome(String s) {
    if(s==null||s.length()==0) 
    	  return true;
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		//正则表达式，将非字母或数字的符号用空字符串代替
		System.out.println(s);
		for(int i = 0; i < s.length() ; i++)
		{
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))							
				return false;			
		}
		return true;
		}
   }