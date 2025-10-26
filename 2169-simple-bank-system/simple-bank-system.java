class Bank {
    ArrayList<Long> arr= new ArrayList<>();
    public Bank(long[] balance) {
        for(long ele:balance)arr.add(ele);
    }
    
    public boolean transfer(int account1, int account2, long money) {
        int max=Math.max(account1,account2);
        if(arr.size()>=max){
            if(arr.get(account1-1)>=money){
                arr.set(account1-1,arr.get(account1-1)-money);
                arr.set(account2-1,arr.get(account2-1)+money);
                return true;
            }
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(arr.size()>=account){
            arr.set(account-1,arr.get(account-1)+money);
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if(arr.size()>=account && arr.get(account-1)>=money){
            arr.set(account-1,arr.get(account-1)-money);
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */