class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] median=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                median[k]=nums1[i];
                i++;
                k++;
            }
            else if(nums2[j]<nums1[i]){
                median[k]=nums2[j];
                j++;
                k++;
            }
        }
while(i<nums1.length){
    median[k]=nums1[i];
    i++;
    k++;
}

while(j<nums2.length){
    median[k]=nums2[j];
    j++;
    k++;
}
        int len=median.length;
        double ans=0.0;
        if(len%2!=0){
            ans=median[len/2];
        }
        else{
            ans=(median[len/2-1]+median[len/2])/2.0;
        }
        return ans;
    }
}