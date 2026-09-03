class Solution {
public:
    int rfirst(vector<int>& arr, int t){
    int s = 0;
    int e = arr.size()-1;
    int first = -1;
    while(s<=e){
        int m = s+(e-s)/2;

        if(arr[m] == t){
            first = m;
            e = m-1;
        }else if(t<arr[m]){
            e = m-1;
        }else{
            s = m+1;
        }
    }
    return first;
}
int rlast(vector<int>& arr, int t){
    int s = 0;
    int e = arr.size()-1;
    int last = -1;
    while(s<=e){
        int m = s+(e-s)/2;

        if(arr[m] == t){
            last = m;
            s=m+1;
        }else if(t<arr[m]){
            e = m-1;
        }else{
            s = m+1;
        }
    }
    return last;
}
vector<int> searchRange(vector<int>& nums, int target) {
        int first = rfirst(nums,target);
        int last = rlast(nums,target);
        return {first,last};
    }
};