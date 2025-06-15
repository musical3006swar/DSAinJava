class Solution {
    public int minimumDifference(int[] x, int k) {
        ArrayList<Integer> y= new ArrayList<>();
        for(int i=0;i<x.length;i++){
            y.add(x[i]);
        }
        Collections.sort(y);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<x.length-k+1;i++){
            int diff=y.get(i+k-1)-y.get(i);
            min=Math.min(min,diff);
        }
        return min;
    }
}