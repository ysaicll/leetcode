public class Solution {
    public int maxArea(int[] height) {
          int maxSize=0;	       
	        for(int i=0,j=height.length-1;i<height.length;i++)
	        {
	        	if(height[i]<=height[j])
	        		maxSize=maxSize>height[i]*(j-i)?maxSize:height[i]*(j-i);
	        	else {
	        		maxSize=maxSize>height[j]*(j-i)?maxSize:height[j]*(j-i);
					j--;
					i--;             //延时一步，否则当前位置就不比较了
				}
	        }
	      //  System.out.println(maxSize);
	        return maxSize;
    }
}
//想象让水自己漫上来