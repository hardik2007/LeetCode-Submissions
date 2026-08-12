class Solution {
    private int findSq(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSq(slow);
            fast = findSq(findSq(fast));
        }while(slow!=fast);

        return slow == 1;
}
}