import  java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int count = 0;
        int candidateElement = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidateElement = nums[i]; // Set candidate to current element
            }
            if(nums[i] == candidateElement) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(candidateElement);
        /*
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i], 1);

            }
        }
        System.out.println(map);

         */


    }
}
