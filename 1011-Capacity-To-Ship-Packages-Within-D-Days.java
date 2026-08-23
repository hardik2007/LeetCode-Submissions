class Solution {
    public boolean isValid(int[] arr, int n, int m, int max){
        int d = 1;
        int p = 0;
        for(int i=0;i<n;i++){
            if(p+arr[i]<=max){
                p+=arr[i];
            }else{
                d++;
                p = arr[i];
            }
        }
        return d<=m;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            if(weights[i]>max){
                max = weights[i];
            }
        }
        int s = max;
        int e = sum;
        int ans = 0;
        while(s<=e){
            int m = s+(e-s)/2;
            if(isValid(weights,n,days,m)){
                ans = m;
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return ans;
    }
}