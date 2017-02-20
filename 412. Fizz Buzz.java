public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        for(int i=1;i<n+1;i++){
			 if(i%3==0&&i%5==0){
				 String s = "FizzBuzz";
				 list.add(s);
			 }	 
			 if(i%3==0&&i%5!=0){
				 String s = "Fizz";
				 list.add(s);
		     }
			 if(i%3!=0&&i%5==0){
				 String s = "Buzz";
				 list.add(s);
	 }       if(i%3!=0&&i%5!=0){
			 String s=Integer.toString(i);
			 list.add(s);
	   }
     }
		 return list;
  }
}