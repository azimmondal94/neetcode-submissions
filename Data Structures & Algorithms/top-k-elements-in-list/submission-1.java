class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int x:nums){
           map.put(x,map.getOrDefault(x, 0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        map.forEach((key,value)->pq.add(new int[]{key,value}));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
}
