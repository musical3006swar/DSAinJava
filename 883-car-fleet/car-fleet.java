class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        double[] time=new double[n];
        HashMap<Integer,Double> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            time[i]=(target-position[i])/(double)speed[i];
            position[i]=target-position[i];
            hm.put(position[i],time[i]);
        }
        Arrays.sort(position);
        for(int i=0;i<n;i++){
            time[i]=hm.get(position[i]);
        }
        for(int i=1;i<n;i++){
            time[i]=Math.max(time[i],time[i-1]);
        }
        HashSet<Double> hs=new HashSet<>();
        for(int i=0;i<n;i++)hs.add(time[i]);
        return hs.size();
    }
}