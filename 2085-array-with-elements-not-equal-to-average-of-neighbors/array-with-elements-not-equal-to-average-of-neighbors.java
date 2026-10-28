class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=go(nums);
        return ans;
    }
    static int[] go(int[] nums){
        Arrays.sort(nums);
         for(int i=1;i<nums.length;i=i+2){
            int temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
         }
          return nums;
    }
}