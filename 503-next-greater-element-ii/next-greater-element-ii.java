class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int res[]=new int[nums.length];
        for(int i=(2*n)-1;i>=0;i--){
            int index=i%n;
            while(!st.isEmpty() && nums[index]>=st.peek()){
                st.pop();
            }
            if(i<=nums.length-1){
                if(st.isEmpty()){
                    res[i]=-1;
                }
                else{
                    res[i]=st.peek();
                }

            }
            st.push(nums[index]);

        }
        return res;
    }
}