class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        
        int value = 0;
        for(int i = 0; i < s.length(); i++){
            value = s.charAt(i)-'a' + 1 ;
            str += value;
        }
        
        while(k-- > 0){
            int sum = 0;
            for(int i = 0; i < str.length(); i++){
                sum += str.charAt(i) - '0';
            }
            str = Integer.toString(sum);
        
        }
        
               
        return Integer.parseInt(str);
    }
}