class Solution {
    public int differenceOfSum(int[] nums) {
        int result=go(nums);
        return result;
    }
    static int go(int[] nums){
        int sum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
           sum=sum+nums[i];
           while(nums[i]>0){
                int dig=nums[i]%10;
                 digitsum=digitsum+dig;
                 nums[i]=nums[i]/10;
           }
        }
        return sum-digitsum;
    }
}