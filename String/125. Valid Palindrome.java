public class Solution {
    public boolean isPalindrome(String s) {
    if(s==null||s.length()==0) 
    	  return true;
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		//������ʽ��������ĸ�����ֵķ����ÿ��ַ�������
		System.out.println(s);
		for(int i = 0; i < s.length() ; i++)
		{
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))							
				return false;			
		}
		return true;
		}
   }