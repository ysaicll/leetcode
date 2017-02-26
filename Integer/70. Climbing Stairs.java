public class Solution {
    public int climbStairs(int n) {
        int a=0,b=1;
        int sum;
        for(int i=1;i<n+1;i++){
         sum=a+b;
         a=b;
         b=sum;
        }
        return b;
    }
}
//ì³²¨ÄÇÆõÊýÁÐ