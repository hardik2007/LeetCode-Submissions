class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int s = 0;
        int e = n-1;
        int idx = n-1;

        while(s<=e){
            int ls = nums[s]*nums[s];
            int rs = nums[e]*nums[e];

            if(ls>rs){
                res[idx] = ls;
                s++;
            }else{
                res[idx] = rs;
                e--;
            }
            idx--;
        }
        return res;
    }
}