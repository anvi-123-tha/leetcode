class Solution {
    public int numberOfSteps(int num) {
        int ans=go(num);
        return ans;
    }
    static int go(int num){
        return common(num,0);
    }
    static int common(int num,int count){
        if(num==0){
            return count;
        }
    
        if(num%2==0){
            return common(num/2,++count);
        }
        return common(num-1,++count);
    }
}