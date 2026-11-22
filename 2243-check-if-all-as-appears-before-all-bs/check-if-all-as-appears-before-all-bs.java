class Solution {
    public boolean checkString(String s) {
        boolean re=go(s);
        return re;
    }
    static boolean go(String s){
        char[] str=s.toCharArray();
           for(int i=0;i<str.length-1;i++){
            if(str[i]=='b'&& str[i+1]=='a'){
                return false;
            }
           }
           return true;
        }
}