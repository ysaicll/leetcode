public class Solution {
    public int lengthOfLastWord(String s) {
	 int index=s.lastIndexOf(" ");      	  //�õ����һ���ո���±�		  
		    int i=s.length();
		    while(index==s.length()-1&&i>-1)   //�ų�λ�����һ������֮��Ŀո�����ַ���ֻ�пո���ɣ���ô�����ÿ�
		    {
		        s=s.substring(0, i);
		        index=s.lastIndexOf(" ");
		        i--;	        
		    }
		    if(s.equals(""))                      //���ַ�����û�����һ������			
		    	return 0; 
		    if(!s.equals("")&&index==-1)	     //�ַ����ǿ��Ҳ����ڿո��Ǿ�ֻʣһ������
		        return s.length();
		    else
		    {
			 int len=s.length()-1-index;        //�ַ������ȼ�ȥ�±��ټ�һ�������һ�����ʵĳ���
			 return len;
		    }
    }
}