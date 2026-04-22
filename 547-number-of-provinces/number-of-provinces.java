class Solution {
    public void countProvinces(int i, int[] vis, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> que = new LinkedList<>();
        que.add(i);
        vis[i]=1;
        while(!que.isEmpty()){
            int idx = que.poll();
            for(int ele:adj.get(idx)){
                if(vis[ele]==0){
                    vis[ele]=1;
                    que.add(ele);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConn) {
        int n = isConn.length;
        int[] vis = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> ls = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(isConn[i][j]==1 && i!=j){
                    ls.add(j);
                }
            }
            adj.add(ls);
        }
        int provinces=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                provinces++;
                countProvinces(i,vis,adj);
            }
        }
        return provinces;
    }
}