public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       boolean ret = true;
        char[] ra = ransomNote.toCharArray();
        Arrays.sort(ra);
        char[] ma = magazine.toCharArray();
        Arrays.sort(ma);

        int index = 0;
        boolean found = true;
        for (int i = 0; i < ra.length && ret; i++) {
            char ri = ra[i];
            found = false;
            for (int j = index; j < ma.length; j++) {
                if (ma[j] > ri) {
                    ret = false;
                    break;
                } else if (ma[j] == ri) {
                    index++;
                    found = true;
                    break;
                } else {
                    index++;
                }
            }
            if (!found) {
                ret = false;
                break;
            }
        }

        return ret;  
    }
}