class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<0)
        return -1;
       
        int[] minCoindp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            minCoindp[i]=Integer.MAX_VALUE;

        }
        for(int i=1;i<=amount;i++){
        for(int coin:coins){
            
            if(coin<=i && minCoindp[i-coin]!=Integer.MAX_VALUE){
                minCoindp[i]=Math.min(minCoindp[i],1+minCoindp[i-coin]  );

            }
            
           
        }
     } 
     return (minCoindp[amount] == Integer.MAX_VALUE) ? -1 : minCoindp[amount];
    
    }
}