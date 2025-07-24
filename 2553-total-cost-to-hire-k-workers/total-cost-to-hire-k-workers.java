class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pql = new PriorityQueue<>();
        PriorityQueue<Integer> pqr = new PriorityQueue<>();

        int l = 0;
        int r = costs.length - 1;
        long total = 0;

        while(pql.size() < candidates && l <= r){
            pql.offer(costs[l++]);
        }

        while(pqr.size() < candidates && l <= r){
            pqr.offer(costs[r--]);
        }

        while(k-->0){
            if(!pql.isEmpty() && (pqr.isEmpty() || pql.peek() <= pqr.peek())){
                total += pql.poll();
                if(l <= r){
                    pql.offer(costs[l++]);
                }
            } else {
                total += pqr.poll();
                if(l <= r){
                    pqr.offer(costs[r--]);
                }
            }
        }

        return total;
    }
}
