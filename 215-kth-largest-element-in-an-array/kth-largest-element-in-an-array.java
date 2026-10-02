class Solution {
    public int findKthLargest(int[] nums, int k) {
     int ans=go(nums,k);
     return ans;
    }
    static int go(int[] nums,int k){
       Arrays.sort(nums);
       return nums[nums.length-k];
       
        }
    
}