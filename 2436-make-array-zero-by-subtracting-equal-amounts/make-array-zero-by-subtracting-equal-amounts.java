class Solution {

    public void helper(int[] nums){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && nums[i] < min){
                min = nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                nums[i] = nums[i] - min;
            }
        }
    }

    public int minimumOperations(int[] nums) {

        int c = 0;

        while(true){

            boolean flag = false;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] > 0){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                break;
            }

            helper(nums);
            c++;
        }

        return c;
    }
}