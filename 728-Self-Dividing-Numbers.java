class Solution {
    public boolean selfDiv(int n){
        int temp = n;

        while(temp>0){
            int d = temp%10;
            if(d==0 || n%d != 0){
                return false;
            }
            temp/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean check = selfDiv(i);
            if(check == true){
                l.add(i);
            }
        }
        return l;
    }
}