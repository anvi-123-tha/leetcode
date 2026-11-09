class Solution {
    public int dominantIndex(int[] nums) {
    int ans=go(nums);
    return ans;
    }
    static int go(int[] nums){
        int max=nums[0];int index=0;
           for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
           }
           int ans=index;
            for(int i=0;i<nums.length;i++){
                if(i!=index && max>=2*nums[i]){
                    ans=index;
                }
                else if(i!=index){
                    ans=-1;
                    break;
                }
            }
            return ans;
            }
}