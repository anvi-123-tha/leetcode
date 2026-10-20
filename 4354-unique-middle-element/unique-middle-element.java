class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        boolean ans=go(nums);
        return ans;
    }
    static boolean go(int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==nums[mid]){
            count++;
         }
        }
        if(count>1){
            return false;
        }
        return true;
    }
}