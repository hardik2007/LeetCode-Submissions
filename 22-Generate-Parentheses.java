class Solution {
    public void backTrack(int n,int open,int close, StringBuilder build, List<String> result){
        if(open == n && close == n){
            result.add(build.toString());
        }

        if(open<n){
            build.append('(');
            backTrack(n,open+1,close,build,result);
            build.deleteCharAt(build.length()-1);
        }

        if(close < open){
            build.append(')');
            backTrack(n,open,close+1,build,result);
            build.deleteCharAt(build.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder build = new StringBuilder();
        List<String> result = new ArrayList<>();
        backTrack(n,0,0,build,result);
        return result;
    }
}