class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //main idea - skip the duplicates every time you make a hit and initial i value
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            //two sum
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int target=-(nums[i]+nums[j]);
                if(set.contains(target)){
                    ans.add(new ArrayList<>(List.of(nums[i],nums[j],target)));
                    //skip the duplicates after hit
                    while(j+1<n && nums[j]==nums[j+1]) j++;
                }
                set.add(nums[j]);
            }
            //skip the duplicates
            while(i+1<n-2 && nums[i]==nums[i+1]) i++;
        }
        return ans;

    }
}
