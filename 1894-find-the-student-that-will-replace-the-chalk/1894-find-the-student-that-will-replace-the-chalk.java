class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        
        
        //sum
        for(int i : chalk){
            sum += i;
        }
        
        System.out.println(sum);
        
        k = (int)(k % sum);
        
        
            for(int i = 0; i < chalk.length; i++){
               if(k < chalk[i]){
                    return i;
                }else{
                    k -= chalk[i];
                }
            }
       return 0;
    }
}