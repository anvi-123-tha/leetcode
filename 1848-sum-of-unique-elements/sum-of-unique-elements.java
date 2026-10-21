class Solution {
    public int sumOfUnique(int[] nums) {
        int ans=go(nums);
        return ans;
    }
    static int go(int[] nums){
    int sum=0;
    Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){int count=0;
            for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
              count++;
            }
        }
        if(count==1){
            sum=sum+nums[i];
        }
        }
        return sum;
     
    }
}