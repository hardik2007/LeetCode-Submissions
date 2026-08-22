class Solution {
    public boolean isValid(int[] arr, int n, int m, int max){
        int st = 1;
        int pages = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                return false;
            }
            if(pages+arr[i] <= max){
                pages+=arr[i];
            }else{
                st++;
                pages = arr[i];
            }
        }
        if(st>m){
            return false;
        }else{
            return true;
        }
    }
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int e = sum;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;

            if(isValid(nums,nums.length,k,m)){
                ans = m;
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return ans;
    }
}