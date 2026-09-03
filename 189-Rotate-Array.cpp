class Solution {
public:
    void reverse(vector<int>& arr, int s, int e){
    while(s<e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
    }
}
    void rotate(vector<int>& nums, int k) {
    int n = nums.size();
    if(n==0 || k==0){
        return;
    }
    k = k%n;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
    }
};