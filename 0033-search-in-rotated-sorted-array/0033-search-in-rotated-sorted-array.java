class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (right+left)/2;
//        if(mid == right && mid==left && nums[mid]!= target)return -1;
        while(left<=right) {
            if(nums[mid]==target) return mid;
            else if (nums[left]<=nums[mid]) {
                if(target>=nums[left] && target <nums[mid]){
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            else if(nums[right]>=nums[mid]){
                if(target>nums[mid] && target <=nums[right]){
                    left = mid+1;
                }
                else {
                    right = mid-1;
                }
            }
            else{
                return -1;
            }
            mid = (right+left)/2;
        }
        return -1;
    }
}