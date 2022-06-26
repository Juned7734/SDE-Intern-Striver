// Time Complexity: O(N)
// Space Complexity: O(1)
class Solution{
    public int reversePairs(int[] nums) {
        int cnt= 0; 
        
        for(int i =0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]>2*(long)nums[j])
                cnt++;
            }
        }

        return cnt;
    }
}