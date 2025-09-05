class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> result = new ArrayList<>();
        int rowbegin=0;
        int colbegin=0;
        int colend=matrix[0].length-1;
        int rowend=matrix.length-1;
        
        while(colbegin<=colend && rowbegin<=rowend){
            for(int j=colbegin;j<=colend;j++){
               result.add( matrix[colbegin][j]);
                
            }
            rowbegin++;
            for(int j=rowbegin;j<=rowend;j++){
                 result.add( matrix[j][colend]);
              
            }
              colend--;
            if(rowbegin<=rowend){
                for(int j=colend;j>=colbegin;j--){
                    result.add( matrix[rowend][j]);
                 
                }
                rowend--;
                if(colbegin<=colend){
                    for(int j=rowend;j>=rowbegin;j--){
                        result.add( matrix[j][colbegin]);
                    
                    }
                    colbegin++;
                }
            }

        }
        return result;
    }
}