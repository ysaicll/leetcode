public class Solution {
     public String longestCommonPrefix(String[] strs) {  
	     if(strs.length==0)
	   	   return "";
	   	 if(strs.length==1)
	   	   return strs[0];
	       int min=strs[0].length();	       
	       for(int i=0;i<strs.length;i++)
	       {	 
	       	 if(min>strs[i].length())
	       		 min=strs[i].length();
	       }
	     if(min==0)
	        return "";
	       String str=strs[0].substring(0,min);
	       int x=min;
	       while(x>0)
	      {
	   	   for(int j=1;j<strs.length;j++)
	   	   {
	   		   
	   		   if(!strs[j].substring(0, min).equals(str))
	   		   {	    			
	   			   min--;
	   			   str=strs[0].substring(0,min);
	   		   }
	   		   else {	
	   			   continue;	    			  		   
	   	       }
	   	   }
	   	   x--;
	   	 }
	      return str;
    }
}