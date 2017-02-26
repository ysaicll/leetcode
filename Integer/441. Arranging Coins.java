public class Solution {
    public int arrangeCoins(int n) {
    if (n == 0)
		return n;
		else {
			int i = 1;
			int count = 0;
			while (n >= i) {
				count++;
				n -= i;
				i++;
			}
			 return count;

		}
    }
}