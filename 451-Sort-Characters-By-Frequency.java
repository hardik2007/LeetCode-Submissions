class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        
        List<Character> chars = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(!chars.contains(c)){
                chars.add(c);
            }
        }
        Collections.sort(chars, (a,b) -> freq[b] - freq[a]);

        StringBuilder string = new StringBuilder();
        for(char c : chars){
            int count = freq[c];
            for(int i=0;i<count;i++){
                string.append(c);
            }
        }
        return string.toString();
    }
}