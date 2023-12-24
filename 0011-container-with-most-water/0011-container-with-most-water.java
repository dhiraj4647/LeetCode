class Solution {
    public int maxArea(int[] height) {
        int max = -9;
        int currMax = 0;
        for (int i = 0, j= height.length-1; i < j; ) {
            currMax = ((height[i]>height[j])?height[j]:height[i])*(j-i);
            if(max<currMax){
                max = currMax;
            }
            if(height[i]>height[j]){
                j--;
            }else{i++;
            }
        }
        return max;
    }
}