
public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0)
        	return false;
       int i=1;
       while(num>0)
       {
    	   num-=i;
    	   i+=2;
       }
       if(num==0)
    	   return true;
       else 
		   return false;
    }
}
/*(n+1)^2
=n^2 + 2n + 1��
= ...
= 1 + (2*1 + 1) + (2*2 + 1) + ... + (2*n + 1)
ע�⵽��Щ����˵Ȳ����У�ÿ��֮�����2����
�������ǿ��ԱȽ� N-1�� N - 1 - 3�� N - 1 - 3 - 5 ... ��0�Ĺ�ϵ��
������һ����������ȥ��1��3��5��7��9��11��13,...
�������0������������������0����ɹ��˳������С�� 0����ʧ���˳���*/