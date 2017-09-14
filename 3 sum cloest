class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len=nums.length;
        int res=nums[0]+nums[1]+nums[len-1];
        int tem=(Math.abs(res-target));
        for (int first=0; first< len-2; first++) {
            int second=first+1;
            int last=len-1;
            int s = target-nums[first];
            while(second<last){
                int sl=nums[second]+nums[last];
                if(Math.abs(sl-s)<tem){
                    tem=Math.abs(sl-s);
                    res=nums[first]+nums[second]+nums[last];
                }
                if(s==sl) return target;
                if(sl>s) last--;
                if(sl<s) second++;
            }
            
        }
        return res;
    }
}

