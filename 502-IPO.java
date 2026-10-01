class Solution {
    public record Pair(int x, int y){}
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;

        List<Pair> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(new Pair (capital[i],profits[i]));
        }
        list.sort(Comparator.comparing(Pair::x));
        PriorityQueue<Integer> profit = new PriorityQueue<>(Collections.reverseOrder());
        int i=0;

        while(k > 0){
            while(i<n && list.get(i).x() <= w){
                profit.offer(list.get(i).y());
                i++;
            }

            if(profit.isEmpty()){
                break;
            }
            w+=profit.poll();
            k--;
        }

        return w;
    }
}