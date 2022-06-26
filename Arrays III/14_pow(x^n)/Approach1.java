// Time Complexity: O(N)
// Space Complexity: O(1)
class Solution {
     
    public double pow(int x ,int n){
        
        long nn= Math.abs(n);
        double ans=x;

        while(nn>1){
           ans= ans*x; 
            nn--;
        }
        if(n<0)
        return 1/ans;
        return ans;

    }
}