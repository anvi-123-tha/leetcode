import java.math.BigInteger;
import java.util.Arrays;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        String result=go(nums,k);
        return result;
    }
    static String go(String[] nums,int k){
   BigInteger ans[]=new BigInteger[nums.length];
      for(int i=0;i<nums.length;i++){
        ans[i]=new BigInteger(nums[i]);
      }
      Arrays.sort(ans);
      return String.valueOf(ans[ans.length-k]);

    }
}