public class Solution {
    public int countSegments(String s) {
        if (s.length()==0)
	        	return 0;
	      //  String []arr=s.split(" ");
	        int count=0;
	        for(int i=0;i<s.length();i++)
	        {
	        	if(s.charAt(i)!=' '&&i==0)
	        	     count++;
	        	else if(s.charAt(i)!=' '&&s.charAt(i-1)==' ') 
				     count++;	
	        }
	      //  System.out.println(count);
	        return count;
    }
}
/*利用字符段的前面是空格而首字母不是空格的特性来判断，当然，s.charAt(0)就是字母的除外*/