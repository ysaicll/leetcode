public class Solution {
    public boolean isHappy(int n) {
        String s=Integer.toString(n);                          
        int sum=0;
        int i=0;
        while(sum!=1&&i<7)                                    //���ڲ���������һ��ѭ��ʮ�����ھ��ܵó����
        {
        	for(int j=0;j<s.length();j++)
        	{
        		sum=(int) (sum+Math.pow(s.charAt(j)-'0', 2));       		
        	}
        	i++;
        	if(sum==1)
        	{
        		return true;       	
        	}	
        	else
        	{
        		s=Integer.toString(sum);                     //�õ���sum��������s��ѭ��
        		sum=0;
        	}
        }
        return false; 
    }
}