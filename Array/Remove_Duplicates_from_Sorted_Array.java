class Solution {

    public int nonRepArray(int[] nums){
        int n=nums.length;
        int k=1;
        for(int i=1; i<n; i++){
            for(int j=i-1; j>=0; j--){
               if(nums[i]!=nums[j]){
                   if(j==0){ nums[k]=nums[i]; k++;}
               }
               else{break;}
            }
        }
        return k;    
    }
    public int removeDuplicates(int[] nums) {
        return nonRepArray(nums);
    }
}
