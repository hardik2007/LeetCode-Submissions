class Solution {
    public boolean detectCapitalUse(String word) {
        int up = 0;
        int c = word.length();

        for(char letter : word.toCharArray()){
            if(Character.isUpperCase(letter)){
                up++;
            }
        }
        return(up == c || up == 0 || (up==1 && (Character.isUpperCase(word.charAt(0)))));
    }
}