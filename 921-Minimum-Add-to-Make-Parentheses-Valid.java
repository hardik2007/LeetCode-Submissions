class Solution {
    public int minAddToMakeValid(String s) {
        int size = 0;
        int open = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            char b = s.charAt(i);
            if(b == '(') size++;
            else{
                if(size != 0){
                    size--;
                }else{
                    open++;
                }
            }
        }
        return size+open;
    }
}