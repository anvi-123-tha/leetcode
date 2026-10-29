import java.util.Arrays;
class Solution {
    public int maximumGap(int[] nums) {
        int result=go(nums);
        return result;
    }
    static int go(int[] nums){
        int n=nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            int ans=nums[i+1]-nums[i];
            if(ans>max){
                max=ans;
            }
        }
        return max;
    }
}