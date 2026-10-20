class Solution {
public static int removeDuplicates(int[] nums){
int ans=go(nums);
return ans;
}
static int go(int[] nums){
    int k=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
}
}