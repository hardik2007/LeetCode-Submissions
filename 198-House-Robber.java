class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int rob1 = 0;
        int rob2 = 0;

        for(int n: nums){
            int max = Math.max(n+rob1,rob2);

            rob1 = rob2;
            rob2 = max;
        }

        return rob2;
    }
}