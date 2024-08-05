class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> b - a
        );
        for(int x : nums)
            pq.add(x);
        
        int kthLargestElement = Integer.MIN_VALUE;
        while(k-- > 0)
            kthLargestElement = pq.poll();
        
        return kthLargestElement;
    }
}