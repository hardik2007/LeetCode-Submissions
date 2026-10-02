class Solution {
    public void backtrack(int i, StringBuilder build, Map<Character,String>map,String digits, List<String> result){
        if(build.length() == digits.length()){
            result.add(build.toString());
            return;
        }

        String letters = map.get(digits.charAt(i));
        for(char c: letters.toCharArray()){
            build.append(c);
            backtrack(i+1,build,map,digits,result);
            build.deleteCharAt(build.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.isEmpty()){
            return result;
        }
        StringBuilder build = new StringBuilder();
        Map<Character,String> map = Map.of(
            '2',"abc",
            '3',"def",
            '4',"ghi",
            '5',"jkl",
            '6',"mno",
            '7',"pqrs",
            '8',"tuv",
            '9',"wxyz"
        );

        if(!digits.isEmpty()){
        backtrack(0,build,map,digits,result);
        }

        return result;
    }
}