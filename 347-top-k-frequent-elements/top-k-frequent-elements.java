class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            ans.add(key);
        }

        ans.sort((a, b) -> map.get(b) - map.get(a));

        return ans.stream()
                  .limit(k)
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}