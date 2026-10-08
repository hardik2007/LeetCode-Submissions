class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder builder = new StringBuilder();
        int count = 0;

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c == '('){
                if(count != 0) builder.append(c);
                count++;
            }else{
                count--;
                if(count !=0) builder.append(c);
            }
        }

        return builder.toString();
    }
}