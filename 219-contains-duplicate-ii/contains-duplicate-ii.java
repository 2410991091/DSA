class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //1 2 3 4
        //false  
        //hashmap                                    
        // 1 2 3 1 k=3 hashmap 1,0  2,1  3,2  1->3    3-0<=k true else false
        //i idx exits   containsKey(i) exists  retrieve get value sub i 0-3 absolute value diff less than equal k true    else   map.put(nums[i],i) ++ 
        //return false   hence no duplicate   
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i]) - i) <= k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }

return false;




    }
}
//1011   1,0   0,1    1,2      0-2<=k ignore update the key value pair  unique 1 
