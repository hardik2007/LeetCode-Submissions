class Solution {
    public int numTrees(int n) {
        int[] num = new int[n+1];
        num[0] = 1;
        num[1] = 1;

        for(int i=2;i<=n;i++){
            int total = 0;
            for(int j=1;j<=i;j++){
                total+=num[j-1] * num[i-j];
            }
            num[i] = total;
        }
        return num[n];
    }
}