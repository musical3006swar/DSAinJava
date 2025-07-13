class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        ArrayList<Integer> player = new ArrayList<>();
        for (int p : players) {
            player.add(p);
        }
        Collections.sort(player);
        ArrayList<Integer> trainer = new ArrayList<>();
        for (int t : trainers) {
            trainer.add(t);
        }
        Collections.sort(trainer);
        int count=0;
        for(int i=0;i<player.size();i++){
            for(int j=0;j<trainer.size();j++){
                int x=player.get(i);
                int y= trainer.get(j);
                if(x<=y){
                    count++;
                    System.out.println(trainer.get(j));
                    trainer.remove(j);

                    break;
                }
            }
            
        }
        return count;
    }
}