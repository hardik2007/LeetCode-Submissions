class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for(char c : s.toCharArray()){
            freq[c]++;
        }

        PriorityQueue<Character> max = new PriorityQueue<>((a,b) -> freq[b] - freq[a]);

        for(int i=0;i<128;i++){
            if(freq[i] > 0){
                max.offer((char) i);
            }
        }

        StringBuilder build = new StringBuilder();
        while(!max.isEmpty()){
            char c = max.poll();
            int count = freq[c];
            for(int i=0;i<count;i++){
                build.append(c);
            }
        }

        return build.toString();
    }
}