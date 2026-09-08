class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stable = -1;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int max = nums[0];
            for(int j = 0; j<i; j++){
                if(max<nums[j]){
                    max = nums[j];
                }
            }
            int min = nums[i];
            for(int j = i; j<n; j++){
                if(min>nums[j]){
                    min = nums[j];
                }
            }
            if((max - min) <= k){
                return i;
            }
        }
        return -1;
    }
}