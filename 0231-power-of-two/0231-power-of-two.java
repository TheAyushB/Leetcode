class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n < 1) return false; 

        if((n & (n - 1)) == 0) return true; // power of 2 number will have only one 1
                                            // number one-less than 2^n is all 1s
                                            // & it and get 0
        return false;
    }
}