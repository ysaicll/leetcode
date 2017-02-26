public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i=0;
        int j=0;
        int count =0;
        while(i<g.length&&j<s.length)//从小到大依次比较
        {
        	if(g[i]<=s[j])
        	{
        		i++;
        		j++;
        		count++;
        	}
        	else
        	{
			    j++;	
			}
        }
       // System.out.println(count);
        return count; 
    }
}