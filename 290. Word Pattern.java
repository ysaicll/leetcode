public class Solution {
    public boolean wordPattern(String pattern, String str) {
    Map<Character, String> map= new HashMap<Character, String>();
     Set<String> set=new HashSet<String>();
     String [] arrStrings=str.split(" ");
     if(pattern.length()!=arrStrings.length)
    	 return false;
     if(pattern.length()==0||pattern.length()==1)
     	return true;
     for(int i=0;i<pattern.length();i++)
     {
    	 char a=pattern.charAt(i);
    	 String b=arrStrings[i];
    	 if(map.containsKey(a)){
    		  if(!map.get(a).equals(b))
    		 return false;
    	 }
    	 else{
    		 if(set.contains(b))
    		   return false;
    		 else{    		 
    		 map.put(a, b);
    		 set.add(b);
    		  }
    		}
    	 }
     return true;
    }
}

//Óë205Ò»Ñù