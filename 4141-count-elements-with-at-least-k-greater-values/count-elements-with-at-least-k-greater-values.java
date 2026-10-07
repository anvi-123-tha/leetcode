class Solution {
    public int countElements(int[] nums, int k) {
        int ans=go(nums,k);
        return ans;
    }
    static int go(int[] nums,int k){
       int n=nums.length;
       int count=0;
       if(k==0){
        return n;
       }
       Arrays.sort(nums);
       for(int i=0;i<n-k;i++){
        if(nums[i]<nums[n-k]){
            count++;
        }
       }
       return count;
        
    }
}