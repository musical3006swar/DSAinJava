class Solution {
    String[] strArr=new String[10];
    {
        strArr[0] = "";
        strArr[1] = "";
        strArr[2]="abc";
        strArr[3]="def";
        strArr[4]="ghi";
        strArr[5]="jkl";
        strArr[6]="mno";
        strArr[7]="pqrs";
        strArr[8]="tuv";
        strArr[9]="wxyz";
    }
    public List<String> letterCombinations(String digits) {
        String ans="";
        List<String> strAl=new ArrayList<>();
        if(digits.equals("")) {
            
            return new ArrayList<>();   
        }
        find(strAl,digits,ans);
        return strAl;
    }
    public void find(List<String> arr, String str, String ans){
        if(str.length()==0){
            arr.add(ans);
            return;
        }
        String temp=strArr[str.charAt(0)-'0'];
        for(int i=0;i<temp.length();i++){
            find(arr,str.substring(1),ans+temp.charAt(i));
        }
    }
}