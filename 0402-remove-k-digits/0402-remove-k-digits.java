class Solution {
    public String removeKdigits(String num, int k) {
         Stack<Character> stack = new Stack<>();
        
        for(char c : num.toCharArray()){
            while(k > 0 && !stack.isEmpty() && c < stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        StringBuilder temp = new StringBuilder();
        
        while(!stack.isEmpty()){
            temp.append(stack.pop());
        }
        
        temp.reverse();
        
        StringBuilder ans = new StringBuilder();
        
        int nonzero = 0;
        
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i) == '0' && nonzero == 0){
                continue;
            }else{
                ans.append(temp.charAt(i));
                nonzero = 1;
            }
        }
        
        if(ans.length() == 0){
            ans.append('0');
        }
        
        return ans.toString();
    }
}