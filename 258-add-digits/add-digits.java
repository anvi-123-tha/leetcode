class Solution {
    public int addDigits(int num) {
        int ans=go(num);
        return ans;
    }
    static int go(int num){
        int result=0;
        while(num!=count(num)){
            int sum=0;
          while(num>0){
            int dig=num%10;
            sum=sum+dig;
            num=num/10;
          }
          result=sum;
          num=result;
        }
        return num;
    }
    static int count(int num){
        int c=0;
        if(num<10){
            return num;
        }
        while(num>0){
        num=num%10;
        c++;
        num=num/10;}
        return c;
    }


}