class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int val : nums1){
            set.add(val);
        }

        for(int val : nums2){
            if(set.contains(val)){
                intersection.add(val);
            }
        }
        int[] output = new int[intersection.size()];
        int k = 0;
        for(int num : intersection){
            output[k++] = num;
        }
        return output;
    }
}