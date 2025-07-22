class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hs = new HashMap<>();
         ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            hs.put(heights[i],names[i]);
            arr.add(heights[i]);
        }
       Collections.sort(arr);
        
        String [] sort = new String[heights.length];
        int j=0;
        for(int i=arr.size()-1;i>=0;i--){
            sort[j]=hs.get(arr.get(i));
            j++;
        }
        return sort;

        
    }
}