public class Solution {
    public boolean isAnagram(String s, String t) {
            char[] ArrS=s.toCharArray();
	        char[] ArrT=t.toCharArray();
	        Arrays.sort(ArrS);
	        Arrays.sort(ArrT);
	        return (String.valueOf(ArrS).equals(String.valueOf(ArrT))); 
    }
}