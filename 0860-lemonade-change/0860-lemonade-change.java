class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0, ten = 0,twenty = 0;
        
        for(int it : bills){
            if(it == 5){
                five++;
            }else if(it == 10){
                if(five > 0){
                 ten++;
                 five--;   
                }else{
                    return false;
                }
            }else if(it == 20){
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }else if(five >= 3){
                    five = five - 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}