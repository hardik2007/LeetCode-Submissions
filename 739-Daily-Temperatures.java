class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int oldDayIndex = stack.pop();
                ans[oldDayIndex] = i-oldDayIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}