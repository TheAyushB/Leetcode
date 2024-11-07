class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Integer.MIN_VALUE;
        int u = 0;
        for(int weight : weights) {
            l = Math.max(l, weight);
            u += weight;
        }
        while(l <= u) {
            int mid = l + (u - l) / 2;
            if(isValid(weights, days, mid))
                u = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
    public boolean isValid(int[] weights, int days, int maxCapacity) {
        int currentCapacity = maxCapacity;
        for(int i = 0; i < weights.length; ) {
            if(currentCapacity - weights[i] >= 0)
                currentCapacity -= weights[i++];
            else {
                days--;
                if(days == 0)
                    return false;
                currentCapacity = maxCapacity;
            }
        } 
        return true;
    }
}