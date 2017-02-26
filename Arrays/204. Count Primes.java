public class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for(int i = 2; i < n; i++){
            if(prime[i]){
                // ��i��2����3����4��...�����Ϊ������
                for(int j = i * 2; j < n; j =  j + i){
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(prime[i]) count++;
        }
        return count;
    }
}