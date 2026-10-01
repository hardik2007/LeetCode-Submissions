class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            nums[i] = -nums[i];
            maxHeap.offer(nums[i]);
        }
        long sum = 0;
        for(int i=0;i<k;i++){
            int out = -maxHeap.poll();
            sum+=out;
            out = (int)Math.ceil((double)out/3);
            maxHeap.offer(-out);
        }

        return sum;
    }
}