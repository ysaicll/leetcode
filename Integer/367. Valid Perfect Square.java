
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
=n^2 + 2n + 1，
= ...
= 1 + (2*1 + 1) + (2*2 + 1) + ... + (2*n + 1)
注意到这些项构成了等差数列（每项之间相差2）。
所以我们可以比较 N-1， N - 1 - 3， N - 1 - 3 - 5 ... 和0的关系。
即，将一个数连续减去，1，3，5，7，9，11，13,...
如果大于0，则继续减；如果等于0，则成功退出；如果小于 0，则失败退出。*/