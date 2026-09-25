class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder b1 = new StringBuilder();
        StringBuilder b2 = new StringBuilder();

        for(String w : word1){
            b1.append(w);
        }
         for(String w : word2){
            b2.append(w);
        }

        return b1.toString().equals(b2.toString());
    }
}