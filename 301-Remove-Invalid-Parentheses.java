class Solution {
    Set<String> set = new HashSet<>();
    int ml;
    public void backtrack(int i, int n, String s, StringBuilder builder, List<String> result, int count){
        if(count < 0) return;

        if(i == n){
            if(count == 0){
                if(builder.length() > ml){
                    ml = builder.length();
                    set.clear();
                }

                if(builder.length() == ml){
                    set.add(builder.toString());
                }
            }
            return;
        }

            char c = s.charAt(i);

            if(c!='(' && c!=')'){
                builder.append(c);
                backtrack(i+1,n,s,builder,result,count);
                builder.deleteCharAt(builder.length()-1);
                return;
            }

            builder.append(c);
            if(c == '('){
            backtrack(i+1,n,s,builder,result,count+1);
            builder.deleteCharAt(builder.length()-1);
            }else{
                backtrack(i+1,n,s,builder,result,count-1);
                builder.deleteCharAt(builder.length()-1);
            }
            backtrack(i+1,n,s,builder,result,count);
    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();
        int i = 0;
        StringBuilder builder = new StringBuilder();
        int count = 0;
        backtrack(i,n,s,builder,result,count);
        for(String bracket : set){
            result.add(bracket);
        }

        return result;
    }
}