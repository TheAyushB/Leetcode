class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int num = n;
        int mask = 0;
        while(n != 0) {
            mask = mask << 1 | 1;
            n = n >> 1;
        }
        return (~num & mask);
    }
}