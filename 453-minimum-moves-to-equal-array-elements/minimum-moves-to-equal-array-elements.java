class Solution {
    public int minMoves(int[] nums) {
        int ans=go(nums);
        return ans;
    }
    static int go(int[] nums){
        int min=nums[0];
        int mov=0;
        int sub=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
        }
     }
     for(int i=0;i<nums.length;i++){
        sub=nums[i]-min;
        mov=mov+sub;
     
     }
     return mov;
    }
}