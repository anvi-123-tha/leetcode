class Solution {
    public int maxProfit(int[] prices) {
        int re=go(prices);
        return re;
    }
    static int go(int[] prices){
        int min=prices[0];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
           int profit=prices[i]-min;
           list.add(profit);
        }
        int max=0;
        for(int j=0;j<list.size();j++){
         if(list.get(j)>max){
            max=list.get(j);
         }
        }
        return max;

    }

}