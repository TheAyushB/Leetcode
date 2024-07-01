class Solution {
    public int singleNumber(int[] nums) {
        int MAX_BITS = 32;
        int countOfSetBits[] = new int[MAX_BITS];
        for(int no : nums)
            for(int bitPos = 0; bitPos < MAX_BITS; bitPos++){
                if((no & (1 << bitPos)) != 0)
                    countOfSetBits[bitPos]++;
            }
            int singleNo = 0;
            for(int i = 0; i < MAX_BITS; i++)
                if(countOfSetBits[i] % 3 != 0) // not a multiple of 3, hence my sengleNo has a set bit at ith position
                    singleNo |= (1 << i); // setting the bit of the singleNo at ith position
            return singleNo;        
    }
}