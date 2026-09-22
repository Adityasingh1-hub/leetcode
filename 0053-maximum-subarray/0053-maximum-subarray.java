class Solution {
    public int maxSubArray(int[] nums) {
        long sum =0 ,maxi = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];


            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum =0;
            }
        }
        return(int)maxi;
    }
}