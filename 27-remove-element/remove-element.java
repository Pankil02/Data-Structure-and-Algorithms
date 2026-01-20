class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int i=0,j=nums.length-1;
        while (i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                nums[j]=Integer.MAX_VALUE;
                j--;
                k++;
            }else{
                i++;
            }
        }
        return nums.length-k;
    }
}