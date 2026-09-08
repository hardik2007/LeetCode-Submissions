class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int[] output = new int[(nums1.length + nums2.length)];
        int n = nums1.length;
        for(int i=0;i<n;i++){
            if(!map1.containsKey(nums1[i])){
                map1.put(nums1[i], 1);
            }
        }
        n = nums2.length;
        int k = 0;
        for(int i=0;i<n;i++){
            if(map1.containsKey(nums2[i])){
                output[k++] = nums2[i];
                map1.remove(nums2[i]);
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = output[i];
        }
        return res;
    }
}