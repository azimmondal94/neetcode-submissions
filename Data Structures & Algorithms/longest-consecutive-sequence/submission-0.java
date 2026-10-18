class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        We can consider a number num as the start of a sequence if and only if
        num - 1 does not exist in the given array. We iterate through the array and
        only start building the sequence if it is the start of a sequence. This 
        avoids repeated work. We can use a hash set for O(1) lookups by converting 
        the array to a hash set.
        */

        Set<Integer> x=new HashSet<>();
        for(int y:nums) x.add(y);

        Set<Integer> start=new HashSet<>();

        for(int n:x) if(!x.contains(n-1)) start.add(n);

        int ans=0;
        for(int n:start){
            int count=1;
            int p=n;
            while(true){
                if(x.contains(++p)) count++;
                else break;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}
