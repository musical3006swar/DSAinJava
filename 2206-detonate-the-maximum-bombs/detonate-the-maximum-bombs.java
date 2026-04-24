class Solution {

    public int bfs(ArrayList<ArrayList<Integer>> adjL, int m){
        Queue<Integer> que = new LinkedList<>();
        int count=0, mCount=0;
        for(int i=0;i<m;i++){
            int[] vis = new int[m];
            vis[i]=1;
            que.offer(i);
            while(!que.isEmpty()){
                ArrayList<Integer> ls = adjL.get(que.poll());
                count++;
                for(int j=0;j<ls.size();j++){
                    int num = ls.get(j);
                    if(vis[num]!=1){
                        que.offer(num);
                        vis[num]=1;
                    }
                }
            }
            mCount=Math.max(count,mCount);
            count=0;
        }
        return mCount;
    }

    public int maximumDetonation(int[][] bombs) {
        int m= bombs.length;
        int n= bombs[0].length;
        int[][] adj = new int[m][m];
        for(int i=0;i<m;i++){
            int x1= bombs[i][0];
            int y1= bombs[i][1];
            int rng1= bombs[i][2];
            for(int j=0;j<m;j++){
                int x2= bombs[j][0];
                int y2= bombs[j][1];
                if(
                    Math.sqrt(
                        Math.pow(x2-x1,2)+
                        Math.pow(y2-y1,2)
                    )<=rng1
                    &&
                    i!=j
                ){
                    adj[i][j]=1;
                }
            }
        }
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> ls = new ArrayList<>();
            for(int j=0;j<m;j++){
                if(adj[i][j]==1){
                    ls.add(j);
                }
            }
            adjL.add(ls);
        }
        return bfs(adjL,m);
    }
}