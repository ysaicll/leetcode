public class Solution {
    public int findComplement(int num) {
          String s=Integer.toBinaryString(num);
	      //ArrayList<Integer>list=new ArrayList<Integer>(s.length());
	      int sum=0;
	      for(int i=0;i<s.length();i++)
	      {
	    	  if(s.charAt(i)=='0')
	    	  sum=sum+(int)Math.pow(2, s.length()-1-i);
	    //		  list.add(1);
	    //	  else 
		//		list.add(0);	
	    //	  sum=sum+(int)Math.pow(2, s.length()-1-i)*list.get(i);
	      }
	     // System.out.println(sum);
	      return sum;  
    }
}