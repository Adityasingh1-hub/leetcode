class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
       if(n==0){
        return 0;
       } 
       Arrays.sort(nums);
       int Lastelement = Integer.MIN_VALUE;
       int count = 0;
       int largest =1;

       for(int i=0;i<n;i++){
         if(nums[i]-1 ==Lastelement){
            count++;
            Lastelement = nums[i];
         }else if(nums[i]!= Lastelement){
            count = 1;
            Lastelement = nums[i];
         }
         largest = Math.max(largest,count);
       }
       
       return largest;
    }
}