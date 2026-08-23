class Solution {
    public boolean isValid(int[] arr, int n, int m, int min){
        int balls = 1;
        int last = arr[0];
        for(int i=1;i<n;i++){
            if((arr[i] - last)>=min){
                balls++;
                last = arr[i];
            }
        }
        return balls >= m;
    }
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        int s = 1;
        Arrays.sort(position);
        int e = position[n-1] - position[0];
        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValid(position,n,m,mid)){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
}