    public class Approach2
    {
        public int findDuplicate(int[] nums) {        
    byte b[] = new byte[nums.length+1];
        
        for(int i=0; i<nums.length; i++){
                b[nums[i]]++;
            if(b[nums[i]]==2)
            return nums[i];
        -
        return -1;
    }