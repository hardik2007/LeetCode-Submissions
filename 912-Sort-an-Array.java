class Solution {
        void merge(int arr[], int s, int e, int m){
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k++] = arr[i];
                i++;
            }else{
                mix[k++] = arr[j];
                j++;
            }
        }
        while(i<m){
            mix[k++] = arr[i++];
        }
        while(j<e){
            mix[k++] = arr[j++];
        }
        int[] res = new int[e-s];
        for(int l=0;l<e-s;l++){
            arr[s+l] = mix[l];
        }
    }

    void mergeSort(int arr[], int s, int e){
        if(e-s<=1){
            return;
        }
        int m = s+(e-s)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m,e);

        merge(arr,s,e,m);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length);
        return nums;
    }
}