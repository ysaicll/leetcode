public class Solution {
    public int lengthOfLastWord(String s) {
	 int index=s.lastIndexOf(" ");      	  //得到最后一个空格的下标		  
		    int i=s.length();
		    while(index==s.length()-1&&i>-1)   //排除位于最后一个单词之后的空格，如果字符串只有空格组成，那么将其置空
		    {
		        s=s.substring(0, i);
		        index=s.lastIndexOf(" ");
		        i--;	        
		    }
		    if(s.equals(""))                      //空字符串就没有最后一个单词			
		    	return 0; 
		    if(!s.equals("")&&index==-1)	     //字符串非空且不存在空格，那就只剩一个单词
		        return s.length();
		    else
		    {
			 int len=s.length()-1-index;        //字符串长度减去下标再减一就是最后一个单词的长度
			 return len;
		    }
    }
}