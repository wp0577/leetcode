class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len=nums.length;
       // if(nums==null || nums[0]>=0 || nums[len-1]<=0 || len<3) return res;
        for(int firstIn=0; firstIn<len &&nums[firstIn]<=0; firstIn++){
            int secondIn=firstIn+1;
            int lastIn=len-1;
             if(firstIn > 0 && nums[firstIn] == nums[firstIn-1])
                continue;
            while(secondIn <lastIn){
                int s=nums[secondIn]+nums[lastIn];
                if(s+nums[firstIn]==0) {
                    res.add(Arrays.asList(nums[firstIn],nums[secondIn],nums[lastIn]));
                    secondIn++;
                    lastIn--;
                     while ( secondIn < lastIn &&nums[lastIn]==nums[lastIn+1]){
                        lastIn--;
                }
                     while (secondIn < lastIn &&nums[secondIn]==nums[secondIn-1] ){
                        secondIn++;
                }
                }
                if(s+nums[firstIn]>0) lastIn--;
                if(s+nums[firstIn]<0) secondIn++;
                
               }
        }
        
        return res;
    }
}
