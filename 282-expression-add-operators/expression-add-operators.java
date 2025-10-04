class Solution {
    ArrayList<String> arr = new ArrayList<>();
    public List<String> addOperators(String num, int target) {
        if (num == null || num.length() == 0) return arr;
        find(num,target,0,"",0,0);
        return arr;
    }
    public void find(String str,int target,int l,String path,long eval,long residual){
        if(l==str.length()){
            if(eval==target){
                arr.add(path);
            }
            return;
            
        }
        
        long num=0;
        for(int i=l;i<str.length();i++){
            if (str.charAt(l)=='0' && i > l) break;
            String currStr = str.substring(l, i + 1);
            num=num*10+(str.charAt(i)-'0');
            if(l==0){
                find(str,target,i+1,path+currStr,num,num);
            }else{
                find(str,target,i+1,path+"+"+currStr,eval+num,num);
                find(str,target,i+1,path+"-"+currStr,eval-num,-num);
                find(str,target,i+1,path+"*"+currStr,eval-residual + residual*num,residual*num);

            }
        }
    }
}