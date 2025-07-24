class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int x=0;
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)x++;
            }
            hm.putIfAbsent(x,new ArrayList<>());
            hm.get(x).add(i);
        }

         for (int key : hm.keySet()) {
            pq.add(key);
        }

        int[] arr=new int[k];
        int i=0,flag=0;
        while(k>0){
            ArrayList<Integer> arrst=hm.get(pq.poll());
            for(int j=0;j<arrst.size() && k>0;j++){
                arr[i++]=arrst.get(j);
                
                k--;
            }
        }
        
        return arr;
    }
}