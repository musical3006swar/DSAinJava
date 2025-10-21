class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();
        for(int hours=0;hours<12;hours++){
            for(int minutes=0;minutes<60;minutes++){
                int setBitsCount=Integer.bitCount(hours)+Integer.bitCount(minutes);
                if(setBitsCount==turnedOn){
                    String time=String.format("%d:%02d",hours,minutes);
                    result.add(time);
                }
            }
        }
        return result;
    }
}