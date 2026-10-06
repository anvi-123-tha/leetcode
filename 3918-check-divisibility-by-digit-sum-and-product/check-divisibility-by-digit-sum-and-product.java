class Solution {
    public boolean checkDivisibility(int n) {
        boolean ans=go(n);
        return ans;
    }
    static boolean go(int n){
        int sum=0;
        int product=1;
        int a=n;
        while(n>0){
            int dig=n%10;
            sum=sum+dig;
            product=product*dig;
            n=n/10;
        }
       int total=sum+product;
        if(a%total==0){
            return true;
        }
        return false;
        
    }
}