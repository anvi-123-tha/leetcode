class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
         long result=go(nums,minK,maxK);
         return result;
    }
    static long go(int[] nums,int minK,int maxK){
        int left=-1;
        int min=-1;
        int max=-1;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                left=i;
            }
            if(nums[i]==minK){
                min=i;
            }
            if(nums[i]==maxK){
                max=i;
            }
            int re=Math.min(max,min)-left;
            if(re>0){
            ans=ans+re;
            }
        }
     return ans;
    }

}