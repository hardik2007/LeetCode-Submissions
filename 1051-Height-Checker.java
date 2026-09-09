class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] out = new int[n];
        for(int i=0;i<n;i++){
            out[i] = heights[i];
        }
        for(int i = 0;i<n;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(heights[j+1]<heights[j]){
                    int temp = heights[j+1];
                    heights[j+1] = heights[j];
                    heights[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        int c = 0;
        for(int i=0;i<n;i++){
            if(heights[i]!=out[i]){
                c++;
            }
        }
        return c;
    }
}