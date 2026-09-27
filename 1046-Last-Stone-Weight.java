class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        for(int i = 0;i<n; i++){
            stones[i] = (-1)*stones[i];
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for(int stone : stones){
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1){
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if(second > first){
                maxHeap.offer(first-second);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }
        return -1*maxHeap.peek();
    }
}