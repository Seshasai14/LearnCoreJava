public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int pointer1=0,pointer2=1;
        while(pointer2<nums.length)
        {
            if(nums[pointer1]==nums[pointer2])
            {
                pointer2++;
            } else if (nums[pointer1]<nums[pointer2]) {
                int temp=nums[pointer1+1];
                nums[pointer1+1]=nums[pointer2];
                nums[pointer2]=temp;
                pointer1++;
                pointer2++;
            }
        }
        System.out.println(pointer1+1);
        System.out.println("Array: " + java.util.Arrays.toString(nums));
    }
}
