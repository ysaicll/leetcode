public class Solution {
    public int[] constructRectangle(int area) {
        int res[]=new int[2];
        int optimal=(int)Math.sqrt(area);  //���ƽ�����������Ž�
        int L=optimal,W=optimal;
        while(L*W!=area)
        {
        	if(L*W>area)                  //���˾ͼ����
         		W--;
        	else                          //С�˾ͼӳ���
        		L++;
        }
        res[0]=L;
    	res[1]=W;
    	//System.out.println(Arrays.toString(res));
        return res;
    }
}