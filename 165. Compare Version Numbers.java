public class Solution {
    public int compareVersion(String version1, String version2) {
   long a = 0, b =0;
        int v1len = version1.length(), v2len = version2.length();
        int i = 0, j = 0;
        while (i < v1len || j < v2len) {
                a = 0; b =0;
                while (i < v1len && version1.charAt(i) != '.') {
                        a = a * 10 + version1.charAt(i) - '0';
                        ++i;
                }
                ++i;
                while (j < v2len && version2.charAt(j) != '.') {
                        b = b * 10 + version2.charAt(j) - '0';
                        ++j;
                }
                ++j;
                if (a > b) return 1;
                if (a < b) return -1;
        }
            return 0;   
    }
}