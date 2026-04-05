class Solution {
    public int[] newArray(int[] nums){
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
    public int[] moveZeroes(int[] nums) {
        return newArray(nums);
    }
}
