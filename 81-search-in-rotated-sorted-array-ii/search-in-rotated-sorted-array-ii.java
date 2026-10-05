class Solution {
    public boolean search(int[] nums, int target) {
        boolean ans=go(nums,target,0,nums.length-1);
        return ans;
    }

    static boolean go(int[] nums,int tar,int s,int e){
        if(s>e){
            return false;
        }

        int m=s+(e-s)/2;

        if(nums[m]==tar){
            return true;
        }

        if(nums[s]==nums[m] && nums[e]==nums[m]){
            s++;
            e--;
            return go(nums,tar,s,e);
        }

        else if(nums[s]<=nums[m]){
            if(tar>=nums[s] && tar<=nums[m]){
                return go(nums,tar,s,m-1);
            }
            else{
                return go(nums,tar,m+1,e);
            }
        }

        else{
            if(tar>=nums[m] && tar<=nums[e]){
                return go(nums,tar,m+1,e);
            }
            else{
                return go(nums,tar,s,m-1);
            }
        }
    }
}