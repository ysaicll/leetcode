public class Solution {
    public int findNthDigit(int n) {
          // �÷�Χ������ʵ�����ֶ�ռ����digit��������
    int digit = 1;
    // �÷�Χ֮ǰ������ʵ�������Ѿ�ռ����totalDigit��������
    long totalDigit = 0;
    // �Ȳ�����䷶Χ
    while (true) {
        long top = totalDigit + digit * 9 * (long)Math.pow(10, digit -1);
        if(n >= totalDigit && n <= top)
            break;
        totalDigit = top;
        digit++;
    }

    // ���ݷ�Χ��������ֵ
    int start = (int)Math.pow(10, digit - 1);
    int ret = 0;
    totalDigit += 1;
    // ��n��digit���ĸ������ʵ��������
    int value = start + (n - (int)totalDigit) / digit;
    ret = Integer.toString((int)value).charAt((int)((n - totalDigit)%digit)) - '0';
    return ret; 
    }
}