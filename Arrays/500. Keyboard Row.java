public class Solution {
    public String[] findWords(String[] words) {
     String s1="qwertyuiopQWERTYUIOP";
	        String s2="asdfghjklASDFGHJKL";
	        String s3="zxcvbnmZXCVBNM";
	        ArrayList<String >list=new ArrayList<String>();
	        for(String w:words)
	        {	 
	        	char first=w.charAt(0);//ȷ����һ����ĸ�����ĸ��ַ���
	        	boolean flag=true;
	        	for(int i=0;i<w.length();i++)
	        	{
	        		if(s1.contains(first+"")&&!s1.contains(w.charAt(i)+""))//������ڵ�һ����ĸ����s1��������s1����������ĸ�������϶�����
	        		{
	        			flag=false;
	        			break;
	        		}
	        		else if(s2.contains(first+"")&&!s2.contains(w.charAt(i)+""))
	        		{
	        			flag=false;
	        			break;
	        		}
	        		else if(s3.contains(first+"")&&!s3.contains(w.charAt(i)+""))
	        		{
	        			flag=false;
	        			break;
	        		}
	        	}
	        	if(flag==true)
	        		list.add(w);
	        }
	         return list.toArray(new String[0]);	        
    }
}