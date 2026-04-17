class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int start=0,indx=0,end=n-1,temp=-1;
        int i=indx;
        while(i<=end){
            if(nums[i]==2){
                temp=nums[i];
                nums[i]=nums[end];
                nums[end]=temp;
                end--;
            } else if(nums[i]==0){
                temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                start++;
                indx++;
            } else{
                indx++;
            }
            i=indx;
        }
    }
}
