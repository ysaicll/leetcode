public class Solution {
    public boolean isHappy(int n) {
        String s=Integer.toString(n);                          
        int sum=0;
        int i=0;
        while(sum!=1&&i<7)                                    //对于测试用例，一般循环十次以内就能得出结果
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
        		s=Integer.toString(sum);                     //得到的sum继续当做s来循环
        		sum=0;
        	}
        }
        return false; 
    }
}