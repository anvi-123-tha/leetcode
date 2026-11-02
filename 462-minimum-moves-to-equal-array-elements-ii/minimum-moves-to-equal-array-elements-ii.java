class Solution {
    public int minMoves2(int[] nums) {
       int res=go(nums);
       return res;
    }
static int go(int[] nums){
    Arrays.sort(nums);
    int mid=nums.length/2;
    int ans=0;
    int sub=0;
for(int i=0;i<nums.length;i++){
   sub=Math.abs(nums[i]-nums[mid]);
   ans=ans+sub;
}
return ans;
}
}