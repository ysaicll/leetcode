public class Solution {
    public int hammingDistance(int x, int y) {
         String x1=Integer.toBinaryString(x);
        String y1=Integer.toBinaryString(y);
    	int count=0;
        if(x1.length()>=y1.length())//如果x1较长，拿出比y1长的前几位与0比，因为y1需要用0补齐，那么前几位不是0的就是不同的，
        {   
        	for(int k=0;k<x1.length()-y1.length();k++)
    		{
    			if(x1.charAt(k)!='0')
    				count ++;		
    		}  
            for(int k=y1.length()-1;k>=0;k--)//后面几位直接比较即可
        		{
        			if(x1.charAt(k+x1.length()-y1.length())!=y1.charAt(k))
        				count ++;		
        		}   	
          
        }
       
        if(x1.length()<y1.length())
        {   
        	
        	for(int k=0;k<y1.length()-x1.length();k++)
    		{
    			if(y1.charAt(k)!='0')
    				count ++;		
    		} 
            for(int k=x1.length()-1;k>=0;k--)
        		{
        			if(y1.charAt(k+y1.length()-x1.length())!=x1.charAt(k))
        				count ++;		
        		}   	  
        }
        return(count);   
    }
}