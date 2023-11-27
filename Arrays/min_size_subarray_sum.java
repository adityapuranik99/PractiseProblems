package Arrays;

class Solution {
    public static void main(String[] args) {    
        int[] arr = { 2,3,1,2,4,3};
        int target = 7;
        int res = minSubArrayLen(target, arr);
        System.out.println(res);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        // System.out.println(start);
        int len_max = Integer.MAX_VALUE;
        int temp_sum = nums[start];
        while(start <= end && end < nums.length){
            System.out.println(temp_sum);
            if (temp_sum < target){
                end++;
                temp_sum += nums[end];
            }
            else if (temp_sum > target){
                temp_sum -= nums[start];
                start++; 
            } 
            else{
                len_max = Math.min(len_max, end - start + 1);
                end++;
                if (end == nums.length)
                    break;
                temp_sum += nums[end];
            }
        }
        return len_max;
    }
}