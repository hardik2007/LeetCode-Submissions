class Solution {
public:
    vector<int> resultArray(vector<int>& nums) {
        int* nums1 = new int[nums.size()]();
        int* nums2 = new int[nums.size()]();

        nums1[0] = nums[0];
        nums2[0] = nums[1];

        int j = 0;
        int k = 0;
        for(int i=2;i<nums.size();i++){
            if(nums1[j]>nums2[k]){
                j++;
                nums1[j] = nums[i]; 
            }else{
                k++;
                nums2[k] = nums[i];
            }
        }
        vector<int> result;
        for(int i=0;i<=j;i++){
            result.push_back(nums1[i]);
        }
        for(int i=0;i<=k;i++){
            result.push_back(nums2[i]);
        }
        delete[] nums1;
        delete[] nums2;
        return result;
    }
};