class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int s=0,e=n-1;
        int a=0;
        while(s<e){
            a=Math.max(a,(e-s)*(Math.min(heights[s],heights[e])));
            if(heights[s]<heights[e]) s++;
            else if(heights[s]>heights[e]) e--;
            else s++;
        }
        return a;
    }
}
