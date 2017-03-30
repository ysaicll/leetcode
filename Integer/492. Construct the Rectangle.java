public class Solution {
    public int[] constructRectangle(int area) {
        int res[]=new int[2];
        int optimal=(int)Math.sqrt(area);  //算出平方根就是最优解
        int L=optimal,W=optimal;
        while(L*W!=area)
        {
        	if(L*W>area)                  //大了就减宽度
         		W--;
        	else                          //小了就加长度
        		L++;
        }
        res[0]=L;
    	res[1]=W;
    	//System.out.println(Arrays.toString(res));
        return res;
    }
}