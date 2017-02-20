public class Solution {
    public char findTheDifference(String s, String t) {
       char tmp = 0x00;
        for(int i=0;i<s.length();i++)
            tmp =(char)( tmp ^ s.charAt(i));
        for(int i=0;i<t.length();i++)
            tmp = (char)(tmp ^ t.charAt(i));
        return tmp;
				
    }
}