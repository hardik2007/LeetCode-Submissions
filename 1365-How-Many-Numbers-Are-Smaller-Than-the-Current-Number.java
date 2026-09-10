class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.putIfAbsent(temp[i], i);
        }
        
        int[] output = new int[n];
        for(int i=0;i<n;i++){
            output[i] = map.get(nums[i]);
        }
        return output;
    }
}