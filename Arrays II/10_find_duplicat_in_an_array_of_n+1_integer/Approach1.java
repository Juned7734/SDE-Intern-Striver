import java.util.*;
public class Approach1{
     public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int num =-1;
        for(int i=0; i<nums.length-1; i++){
          if(nums[i]==nums[i+1])
          return nums[i];
        }
        return nums;

}