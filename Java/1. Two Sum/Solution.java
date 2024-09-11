import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = target - nums[i];
            if(numToIndex.containsKey(complement)){
                return new int[]{
                        numToIndex.get(complement),i
                };
            }
            numToIndex.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result= twoSum(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("[" + result2[0] + "," + result2[1] + "]");  // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("[" + result3[0] + "," + result3[1] + "]");  // Output: [0, 1]
    }
}