class Solution {
    public int findComplement(int num) {
        int number = num;
        int mask = 0;
        while(number != 0) {
            mask = mask << 1 | 1;
            number = number >> 1;
        }
        return (~num & mask);
    }
}