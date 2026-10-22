class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int p=0;
        int g=prices[n-1];
        for(int i=n-2;i>=0;i--){
            if(g>prices[i]){
                p=Math.max(p,g-prices[i]);
            }else g=prices[i];
        }
        return p;
    }
}
