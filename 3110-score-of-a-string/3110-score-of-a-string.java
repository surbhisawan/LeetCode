class Solution {
    public int scoreOfString(String s) {
        
        int size = s.length();
        int sum = 0 ;
        // int a = 0, b = 0;
        
        for(int i = 1; i < size; i++){
            sum += Math.abs( (int)s.charAt(i) - (int)s.charAt(i-1));
            System.out.println(sum);
            
//             a = (int)s.charAt(i);
//             b = (int)s.charAt(i-1);
            
//             sum += Math.abs(b-a);
            
//             System.out.println(b +" " + a);
            
        }
        return sum;
    }
}