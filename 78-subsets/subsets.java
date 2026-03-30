import java.util.*;

class Solution {
    
    public static void rec(int idx, int[] nums, List<Integer> a, List<List<Integer>> ans) {
        int n = nums.length;

        // Base case
        if (idx == n) {
            ans.add(new ArrayList<>(a));
            return;
        }

        // Pick the element
        a.add(nums[idx]);
        rec(idx + 1, nums, a, ans);

        // Backtrack (remove picked element)
        a.remove(a.size() - 1);

        // Not pick the element
        rec(idx + 1, nums, a, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        rec(0, nums, a, ans);
        return ans;
    }
}