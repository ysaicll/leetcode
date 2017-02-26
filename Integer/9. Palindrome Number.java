
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<=Integer.MAX_VALUE&&x>=Integer.MIN_VALUE)
		{	
		String str=Integer.toString(x);
		int i;
		String a="";
		for(i=str.length()-1;i>-1;i--){
			char c=str.charAt(i);
			a=a+c;
		}
		//int b=Integer.parseInt(a);
		if(a.equals(str))
			return true;
		else
			return false;
		}
		else
			return false;
		
  }
}