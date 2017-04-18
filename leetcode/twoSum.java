// The first solution I used
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){  //注意数组的长度表示方式
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}

// Hashmap method
public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}

// sort method
// After sort, we can compare the sum of minimum and max to target and then reduce the start number or end number.
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] orgNums=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           orgNums[i]=nums[i];
        }
        Arrays.sort(nums);  //数组的排序方法
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum<target){
                start++;
            }
            else if(sum>target){
                end--;
            }
            else if(sum==target){
                break;
            }
        }
        int[] ret=new int[2];
        int index=0;
        int a=nums[start];
        int b=nums[end];
        for(int i=0;i<nums.length;i++)
            if(orgNums[i]==a || orgNums[i]==b)
                ret[index++]=i;
        return ret;
    }
}
