class Solution {
    public int findNonMinOrMax(int[] nums) {
        int ans=go(nums);
        return ans;
    }
    static int go(int[] nums){
        int max=nums[0];
        int min=nums[0];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
                  if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=min){
              ans=nums[i];
            }
        }
        if(ans==0){
            return -1;
        }
     return ans;   
    }
}