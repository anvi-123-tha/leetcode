import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lister = go(nums, target);
        return lister;
    }

    static List<Integer> go(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    first = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (first != -1) {
            while (first < nums.length && nums[first] == target) {
                list.add(first);
                first++;
            }
        }

        return list;
    }
}