class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack();
        int maxarea=0;
        int currentheight=-1;
        for(int i=0;i<=heights.length;i++){
            if(i==heights.length){
                currentheight=0;

            }
            else{
                currentheight=heights[i];
            }
            while(!st.isEmpty() && currentheight<heights[st.peek()]){
                int length=heights[st.pop()];
                int width;
                if(!st.isEmpty()){
                    width=i-st.peek()-1;
                }
                else{
                    width=i;
                }
                int area=length*width;
                maxarea=Math.max(area,maxarea);
            }
            st.push(i);

        }
        return maxarea;
        
    }
}