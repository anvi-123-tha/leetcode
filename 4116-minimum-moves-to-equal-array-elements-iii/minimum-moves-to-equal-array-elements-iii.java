class Solution {
    public int minMoves(int[] nums) {
        int re=go(nums);
        return re;
    }
    static int go(int[] nums){
        int ans=0;
        int max=nums[0];
        int diff=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            diff=max-nums[i];
            ans=ans+diff;
        }
        return ans;
    }
}