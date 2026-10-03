class Solution {

    public boolean isMonotonic(int[] nums) {

        boolean ans=go(nums,0);

        return ans;
    }

    static boolean go(int[] nums,int index){
    if(index==nums.length-1){
        return true;
    }
    if(nums[0]<=nums[nums.length-1]){
        return nums[index]<=nums[index+1] && go(nums,index+1);
    }
    else{
        return nums[index]>=nums[index+1] && go(nums,index+1);
    }
       
    }
}