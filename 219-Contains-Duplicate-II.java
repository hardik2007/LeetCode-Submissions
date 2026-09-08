class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            Integer last = map.put(nums[i], i);

            if(last!= null && (i-last)<=k){
                return true;
            }
        }
        return false;
    }
}