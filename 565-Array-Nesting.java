class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                continue;
            }

            int cl = 0;
            int idx = i;
            while(nums[idx] >= 0){
                int next = nums[idx];
                nums[idx] = -1;
                idx = next;
                cl++;
            }
            max = Math.max(max,cl);
        }
        return max;
    }
}