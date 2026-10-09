class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0;
        int insertions = 0;
        int i = 0;

        while(i<n){
            char c = s.charAt(i);
            if(c == '('){
                count++;
                i++;
            }
            else{
                if(count > 0){
                    count--;
                }else{
                    insertions++;
                }

                if(i+1 < n && s.charAt(i+1) == ')'){
                    i+=2;
                }else{
                    insertions++;
                    i++;
                }
            }
        }
        return count*2+insertions;
    }
}