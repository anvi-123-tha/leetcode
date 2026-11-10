
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans=go(nums,original);
        return ans;
    }

    static int go(int[] nums,int original){
        for(int i=0;i<nums.length;i++){
            if(original==nums[i]){
                original=original*2;
                i=-1;
            }
        }
        return original;
    }
}