class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)-> Integer.compare(a[0], b[0]));

        for(int[] point : points){
            int x = point[0];
            int y = point[1];

            int distance = (x*x) + (y*y);
            minHeap.offer(new int[] {distance,x,y});
        }

        int[][] result = new int[k][2];
        int index = 0;
        while(k>0){
            int[] values = (minHeap.poll());
            result[index][0] = values[1];
            result[index][1] = values[2];
            index++;
            k--;
        }

        return result;
    }
}