class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(map.get(ch)==1){
            return i;
        }
       }
        return -1;
        
    }
}