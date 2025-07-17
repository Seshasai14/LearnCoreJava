public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int startPoint = 0;
        int endPoint = nums.length;
        for (int i = 0; i < endPoint; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[startPoint];
                nums[startPoint] = temp;
                startPoint++;
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

/*
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
