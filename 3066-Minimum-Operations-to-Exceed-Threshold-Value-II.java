class Solution {
    public int minOperations(int[] nums, int k) {
        int c = 0;
        PriorityQueue<Long> min = new PriorityQueue<>();
        for(int num : nums){
            min.offer((long)num);
        }

        while(min.size() >= 2 && min.peek() < k){
            long x = min.poll();
            long y = min.poll();
            min.offer((2*x) + y);
            c++;
        }

        return c;
    }
}