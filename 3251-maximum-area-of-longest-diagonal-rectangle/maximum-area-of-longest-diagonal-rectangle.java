class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area=0;
        double dig=0;
        int n=dimensions.length;
        for(int i=0;i<n;i++){
            double tempDig=Math.sqrt(Math.pow(dimensions[i][0],2)+Math.pow(dimensions[i][1],2));
            if(tempDig>dig || (tempDig == dig && dimensions[i][0]*dimensions[i][1] >area)){
                dig=tempDig;
                area=dimensions[i][0]*dimensions[i][1];
            }
        }
        return area;        
    }
}