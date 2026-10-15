class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(map.containsKey(target-x)) return new int[]{map.get(target-x),i};
            map.put(x,i);
        }
        return new int[]{};
    }
}
